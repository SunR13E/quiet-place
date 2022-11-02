package com.example.quietplace.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.quietplace.QuietPlaceApp
import com.example.quietplace.R
import com.example.quietplace.ui.extension.navigateSafe
import com.example.quietplace.ui.factory.ViewModelFactory
import javax.inject.Inject
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private val viewModel: MainActivityViewModel by viewModels { viewModelFactory }

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as QuietPlaceApp).di.inject(this)
        setContentView(R.layout.layout_main_activity)
        navController = findNavController(R.id.nav_host_fragment)
        observeNavigation()
    }

    override fun onStart() {
        super.onStart()
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }

    override fun onSupportNavigateUp() = navController.navigateUp()

    private fun observeNavigation() {
        lifecycleScope.launch {
            viewModel.navDirections.collect {
                val directions = it.consume()
                navController.navigateSafe(directions)
            }
        }
    }
}
