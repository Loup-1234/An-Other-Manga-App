package com.example.an_other_manga_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import com.example.an_other_manga_app.ui.theme.AnOtherMangaAppTheme

data class BottomNavItem(val iconResId: Int, val label: String)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnOtherMangaAppTheme {
                val navController = rememberNavController()
                var selectedItem by remember { mutableIntStateOf(0) }

                val items = listOf(
                    BottomNavItem(R.drawable.ic_library_24dp, "Library"),
                    BottomNavItem(R.drawable.ic_browse_24dp, "Browse")
                )

                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    AppNavigation(navController = navController)

                    BottomAppBar {
                        items.forEachIndexed { index, item ->
                            NavigationBarItem(
                                icon = { Icon(painterResource(id = item.iconResId), contentDescription = item.label) },
                                label = { Text(item.label) },
                                selected = selectedItem == index,
                                onClick = { selectedItem = index }
                            )
                        }
                    }
                }
            }
        }
    }
}