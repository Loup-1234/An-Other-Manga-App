package com.example.an_other_manga_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
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
                Scaffold(
                    bottomBar = {
                        BottomNavBar(
                            navController = navController,
                            items = listOf(
                                BottomNavItem(R.drawable.ic_library_24dp, "Library"),
                                BottomNavItem(R.drawable.ic_browse_24dp, "Browse"),
                                BottomNavItem(R.drawable.ic_settings_24dp, "Settings")
                            ),
                            currentRoute = navController.currentDestination?.route ?: "library"
                        )
                    }
                ) { contentPadding ->
                    Column(modifier = Modifier.padding(contentPadding)){
                        NavGraph(navController = navController, contentPadding)
                    }
                }
            }
        }
    }
}