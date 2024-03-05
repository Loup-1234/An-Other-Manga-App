package com.example.an_other_manga_app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.an_other_manga_app.fragment.BrowseFragment
import com.example.an_other_manga_app.fragment.LibraryFragment

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "library") {
        composable("library") { LibraryFragment() }
        composable("browse") { BrowseFragment() }
    }
}