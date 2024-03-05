package com.example.an_other_manga_app

// Importations nécessaires pour l'application
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.an_other_manga_app.ui.browse.BrowseFragment
import com.example.an_other_manga_app.ui.library.LibraryFragment

// Fonction Composable pour la navigation dans l'application
@Composable
fun AppNavigation(navController: NavHostController) {
    // Hôte de navigation avec le contrôleur de navigation et la destination de départ
    NavHost(navController, startDestination = "library") {
        // Destination composable pour la bibliothèque
        composable("library") { LibraryFragment() }
        // Destination composable pour la navigation
        composable("browse") { BrowseFragment() }
    }
}
