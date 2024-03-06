package com.example.an_other_manga_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.an_other_manga_app.ui.navigation.NavBar
import com.example.an_other_manga_app.ui.theme.AnOtherMangaAppTheme

data class BottomNavItem(val iconResId: Int, val label: String)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnOtherMangaAppTheme {
                NavBar()
            }
        }
    }
}