package com.example.an_other_manga_app.ui.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import com.example.an_other_manga_app.BottomNavItem
import com.example.an_other_manga_app.R

@Composable
fun NavBar() {

    // 1. Définir le contrôleur de navigation
    val navController = rememberNavController()

    // 2. Définir les éléments de la barre de navigation
    val items = remember {
        listOf(
            BottomNavItem(R.drawable.ic_library_24dp, "Bibliothèque"),
            BottomNavItem(R.drawable.ic_browse_24dp, "Parcourir")
        )
    }

    // 3. Suivre l'élément sélectionné
    var selectedItem by remember { mutableIntStateOf(0) }

    // 4. Contenu principal
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colorScheme.surface)) {

        AppNavigation(navController = navController)

        // 5. Barre de navigation inférieure
        BottomAppBar(modifier = Modifier.align(Alignment.BottomCenter)) {

            // 6. Éléments de navigation
            items.forEachIndexed { index, item ->

                NavigationBarItem(
                    icon = {
                        Icon(
                            painterResource(id = item.iconResId),
                            contentDescription = item.label
                        )
                    },
                    label = { Text(item.label) },

                    // 7. Mettre à jour l'élément sélectionné
                    selected = selectedItem == index,
                    onClick = {
                        if(selectedItem != index) {
                            selectedItem = index

                            // 8. Naviguer
                            val destination = if(index == 0) "library" else "browse"
                            navController.navigate(destination)
                        }
                    }
                )
            }
        }
    }
}