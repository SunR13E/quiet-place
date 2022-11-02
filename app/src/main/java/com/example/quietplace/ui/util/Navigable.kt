package com.example.quietplace.ui.util

import androidx.navigation.NavDirections

interface Navigable {

    fun navigate(direction: NavDirections)

    fun exit()
}
