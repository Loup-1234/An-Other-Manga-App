package com.example.an_other_manga_app.fragment

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class LibraryFragment {
    @Composable
    fun ElevatedCard(image: Painter, title: String, description: String) {
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .size(width = 240.dp, height = 100.dp)
        ) {
            Column {
                Image(painter = image, contentDescription = "Image")
                Text(text = title, modifier = Modifier.padding(16.dp), textAlign = TextAlign.Start)
                Text(text = description, modifier = Modifier.padding(16.dp), textAlign = TextAlign.Start)
            }
        }
    }
}