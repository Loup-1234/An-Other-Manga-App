package com.example.an_other_manga_app.ui.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.an_other_manga_app.R

@Composable
fun SettingsButton(navController: NavController.Companion) {

    val navigation = rememberNavController()

    IconButton(onClick = {
        navigation.navigate("settings")
    }) {
        Icon(
            painter = painterResource(id = R.drawable.ic_settings_24dp),
            contentDescription = "Settings"
        )
    }

}