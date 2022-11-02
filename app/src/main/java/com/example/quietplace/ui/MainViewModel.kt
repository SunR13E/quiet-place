package com.example.quietplace.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import com.example.quietplace.ui.util.Event
import com.example.quietplace.ui.util.Navigable
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.filterNotNull

@Suppress("PropertyName")
abstract class MainViewModel : ViewModel(), Navigable {

    private val _navDirections = MutableStateFlow<Event<NavDirections>?>(null)
    val navDirections = _navDirections.filterNotNull()

    private val onClearedListeners = mutableListOf<() -> Unit>()

    override fun navigate(direction: NavDirections) { _navDirections.value = Event(direction) }

    private val _exit = MutableLiveData<Event<Unit>>()
    val exit: LiveData<Event<Unit>> = _exit

    override fun exit() = _exit.postValue(Event(Unit))

    override fun onCleared() {
        onClearedListeners.forEach { it.invoke() }
        onClearedListeners.clear()
        super.onCleared()
    }
}
