package com.example.an_other_manga_app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.an_other_manga_app.ui.theme.AnOtherMangaAppTheme

data class BottomNavItem(val iconResId: Int, val label: String)

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
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

                Scaffold(
                    content = { AppNavigation(navController = navController) },
                    bottomBar = {
                        BottomAppBar(
                            contentPadding = PaddingValues(16.dp)
                        ) {
                            items.forEachIndexed { index, item ->
                                NavigationBarItem(
                                    icon = { Icon(painterResource(id = item.iconResId), contentDescription = item.label) },
                                    label = { Text(item.label) },
                                    selected = selectedItem == index,
                                    onClick = {
                                        selectedItem = index
                                        if (index == 0) {
                                            navController.navigate("library")
                                        } else {
                                            navController.navigate("browse")
                                        }
                                    }
                                )
                            }
                        }
                    }
                )
            }
        }
    }
}