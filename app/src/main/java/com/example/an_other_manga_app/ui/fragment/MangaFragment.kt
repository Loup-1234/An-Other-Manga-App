package com.example.an_other_manga_app.ui.fragment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.an_other_manga_app.R
import com.example.an_other_manga_app.ui.theme.AnOtherMangaAppTheme

@Composable
fun MangaFragment() {
    AnOtherMangaAppTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.surface),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.mipmap.extreme_violence),
                contentDescription = "Extreme Violence",
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxSize()
                    .align(Alignment.Center)
            )
        }
    }
}