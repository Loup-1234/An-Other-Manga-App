package com.example.an_other_manga_app

// Importations nécessaires pour l'application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import com.example.an_other_manga_app.ui.theme.AnOtherMangaAppTheme

// Classe de données pour représenter un élément de la barre de navigation inférieure
// Chaque élément a une icône et une étiquette
data class BottomNavItem(val iconResId: Int, val label: String)

// Activité principale de l'application
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Utilisation du thème défini pour l'application
            AnOtherMangaAppTheme {
                // Création d'un NavController pour gérer la navigation dans l'application
                val navController = rememberNavController()

                // Liste des éléments de la barre de navigation inférieure
                val items = remember {
                    listOf(
                        BottomNavItem(R.drawable.ic_library_24dp, "Library"),
                        BottomNavItem(R.drawable.ic_browse_24dp, "Browse")
                    )
                }

                // État pour suivre l'élément sélectionné dans la barre de navigation inférieure
                var selectedItem by remember { mutableIntStateOf(0) }

                // Box qui remplit toute la taille de l'écran
                Box(modifier = Modifier.fillMaxSize()) {
                    // Navigation de l'application
                    AppNavigation(navController = navController)

                    // Barre de navigation inférieure
                    BottomAppBar {
                        // Pour chaque élément dans la liste des éléments
                        items.forEachIndexed { index, item ->
                            // Création d'un élément de navigation
                            NavigationBarItem(
                                // Icône pour l'élément
                                icon = { Icon(painterResource(id = item.iconResId), contentDescription = item.label) },
                                // Étiquette pour l'élément
                                label = { Text(item.label) },
                                // Vérifie si l'élément est actuellement sélectionné
                                selected = selectedItem == index,
                                // Action à effectuer lorsqu'on clique sur l'élément
                                onClick = {
                                    if (selectedItem != index) { // Si l'élément sélectionné n'est pas l'élément actuel
                                        // Met à jour l'élément sélectionné
                                        selectedItem = index
                                        // Détermine la destination en fonction de l'index
                                        val destination = if (index == 0) "library" else "browse"
                                        // Navigue vers la destination
                                        navController.navigate(destination)
                                    }
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}