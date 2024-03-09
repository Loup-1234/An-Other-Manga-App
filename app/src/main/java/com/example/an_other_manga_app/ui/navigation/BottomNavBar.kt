package com.example.an_other_manga_app.ui.navigation

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.an_other_manga_app.BottomNavItem
import com.example.an_other_manga_app.ui.theme.AnOtherMangaAppTheme

@Composable
fun BottomNavBar(
    navController: NavHostController,
    items: List<BottomNavItem>,
    currentRoute: String
) {
    AnOtherMangaAppTheme {
        var selectedItem by remember { mutableStateOf(currentRoute) }

        BottomAppBar {
            items.forEachIndexed { index, item ->
                val route = if (index == 0) "library" else "browse"

                NavigationBarItem(
                    icon = {
                        Icon(
                            painterResource(id = item.iconResId),
                            contentDescription = item.label
                        )
                    },
                    label = { Text(item.label) },
                    selected = selectedItem == route,
                    onClick = {
                        selectedItem = route
                        navController.navigate(route)
                    }
                )
            }
        }
    }
}