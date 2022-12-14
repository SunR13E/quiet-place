package com.example.quietplace.ui.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

class ViewModelFactory @Inject constructor(
    private val viewModels: MutableMap<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <viewModel : ViewModel> create(modelClass: Class<viewModel>): viewModel {
        val viewModelProvider = viewModels[modelClass]
            ?: throw IllegalArgumentException(
                "View model class $modelClass not found. Add binding to \"ViewModelModule\""
            )
        return viewModelProvider.get() as viewModel
    }
}
