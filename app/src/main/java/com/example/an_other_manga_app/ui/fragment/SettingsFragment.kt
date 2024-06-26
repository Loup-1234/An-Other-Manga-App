package com.example.an_other_manga_app.ui.fragment

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.an_other_manga_app.ui.navigation.TopSearchBar
import com.example.an_other_manga_app.ui.theme.AnOtherMangaAppTheme

@Composable
fun SettingsFragment(navController: NavHostController) {
    AnOtherMangaAppTheme {
        Column(modifier = Modifier.padding(8.dp)) {
            TopSearchBar()

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = MaterialTheme.colorScheme.surface),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    modifier = Modifier
                        .clickable { navController.navigate("lifetime_showtime") },
                    text = "Work in progress",
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.secondary
                )
            }
        }
    }
}