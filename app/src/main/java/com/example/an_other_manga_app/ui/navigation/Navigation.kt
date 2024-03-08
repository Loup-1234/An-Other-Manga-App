package com.example.an_other_manga_app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.an_other_manga_app.ui.fragment.BrowseFragment
import com.example.an_other_manga_app.ui.fragment.LibraryFragment
import com.example.an_other_manga_app.ui.fragment.MangaFragment

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = "library") {
        composable("library") { LibraryFragment(navController) }
        composable("browse") { BrowseFragment() }
        composable("manga") { MangaFragment() }
    }
}