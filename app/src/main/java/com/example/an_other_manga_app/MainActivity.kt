package com.example.an_other_manga_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.an_other_manga_app.ui.navigation.BottomNavBar
import com.example.an_other_manga_app.ui.navigation.NavGraph
import com.example.an_other_manga_app.ui.theme.AnOtherMangaAppTheme

data class BottomNavItem(val iconResId: Int, val label: String)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            AnOtherMangaAppTheme {
                MainScreenComposable(navController = navController)
            }
        }
    }
}

@Composable
fun MainScreenComposable(navController: NavHostController) {
    val items = remember {
        listOf(
            BottomNavItem(R.drawable.ic_library_24dp, "Library"),
            BottomNavItem(R.drawable.ic_browse_24dp, "Browse"),
            BottomNavItem(R.drawable.ic_settings_24dp, "Settings")
        )
    }

    Scaffold(
        bottomBar = {
            BottomNavBar(
                navController = navController,
                items = items,
                currentRoute = navController.currentDestination?.route ?: "library"
            )
        }
    ) { contentPadding ->
        NavGraph(navController = navController, contentPadding)
    }
}