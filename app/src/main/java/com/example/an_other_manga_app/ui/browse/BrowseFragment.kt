package com.example.an_other_manga_app.ui.browse

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.an_other_manga_app.ui.theme.AnOtherMangaAppTheme

@Composable
fun BrowseFragment() {
    AnOtherMangaAppTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Browse Fragment",
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}