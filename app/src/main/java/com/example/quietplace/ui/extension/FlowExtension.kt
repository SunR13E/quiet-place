package com.example.quietplace.ui.extension

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.quietplace.ui.util.Event
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

/** Google recommend keep subscribe at least 5s
For more info https://medium.com/androiddevelopers/migrating-from-livedata-to-kotlins-flow-379292f419fb
 **/
const val STOP_UPSTREAM_DELAY = 5000L

fun <T> Flow<T>.shareEagerly(scope: CoroutineScope): SharedFlow<T> {
    return shareIn(scope, SharingStarted.Eagerly, replay = 1)
}

fun <T> Flow<T>.stateWhileSubscribed(scope: CoroutineScope, initialValue: T): StateFlow<T> {
    return stateIn(scope, SharingStarted.WhileSubscribed(STOP_UPSTREAM_DELAY), initialValue)
}

fun <T> Flow<T>.stateWhileSubscribed(scope: CoroutineScope): StateFlow<T?> {
    return stateIn(scope, SharingStarted.WhileSubscribed(STOP_UPSTREAM_DELAY), null)
}

fun <T> Flow<T>.stateEagerly(scope: CoroutineScope): StateFlow<T?> {
    return stateIn(scope, SharingStarted.Eagerly, null)
}

fun <T> Flow<T>.toEvent(): Flow<Event<T>> = map { Event(it) }

fun <T> Flow<T>.collectInScope(scope: CoroutineScope, collector: suspend (T) -> Unit) {
    scope.launch {
        collect(FlowCollector(collector))
    }
}

fun <T> Flow<T>.collectInLifecycle(
    lifecycleOwner: LifecycleOwner,
    state: Lifecycle.State = Lifecycle.State.STARTED,
    collector: suspend (T) -> Unit
) {
    collectInScope(lifecycleOwner.lifecycleScope) {
        lifecycleOwner.repeatOnLifecycle(state) {
            collect(FlowCollector(collector))
        }
    }
}
