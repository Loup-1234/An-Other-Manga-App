package com.example.an_other_manga_app.ui.fragment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun LibraryFragment() {
    LazyColumn {
        items(1000) { index ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = colorScheme.surface),
                contentAlignment = Alignment.Center ) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = colorScheme.surfaceVariant,
                    ),
                    modifier = Modifier
                        .width(350.dp)
                        .height(450.dp)
                        .padding(8.dp)
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Text(
                            text = "Manga $index",
                            modifier = Modifier
                                .padding(16.dp),
                            textAlign = TextAlign.Center,
                            color = colorScheme.secondary
                        )
                    }
                }
            }
        }
    }
}