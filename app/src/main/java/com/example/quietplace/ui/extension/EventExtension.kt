package com.example.quietplace.ui.extension

import androidx.lifecycle.Observer
import com.example.quietplace.ui.util.Event

open class EventObserver<T>(private val onEventUnconsumedContent: (T) -> Unit) :
    Observer<Event<T>?> {
    override fun onChanged(event: Event<T>?) {
        event?.consume()?.run(onEventUnconsumedContent)
    }
}
