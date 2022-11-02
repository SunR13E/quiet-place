package com.example.quietplace.ui.extension

import androidx.navigation.NavController
import androidx.navigation.NavDirections
import com.github.ajalt.timberkt.Timber

fun NavController.navigateSafe(
    directions: NavDirections?
) {
    if (directions == null) return
    val current = currentDestination
    val targetActionInCurrent = current?.getAction(directions.actionId)
    when {
        targetActionInCurrent == null -> {
            Timber.e { "No such action for current destination: ${current?.label} $directions" }
            return
        }
        targetActionInCurrent.destinationId == current.id -> {
            Timber.e { "Already in: ${current.label}" }
            return
        }
        else -> navigate(directions)
    }
}
