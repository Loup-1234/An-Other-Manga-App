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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

object LibraryFragment {
    @Composable
    fun ElevatedCard(image: Int, title: String, description: String) {
        ElevatedCard(
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
            modifier = Modifier.size(width = 240.dp, height = 100.dp)
        ) {
            Column {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = "Image"
                )
                Text(text = title, modifier = Modifier.padding(16.dp), textAlign = TextAlign.Start)
                Text(text = description, modifier = Modifier.padding(16.dp), textAlign = TextAlign.Start)
            }
        }
    }

    @Composable
    fun MultipleElevatedCards(cardItems: List<CardItem>) {
        Column {
            cardItems.forEach { item ->
                ElevatedCard(
                    image = item.image,
                    title = item.title,
                    description = item.description
                )
            }
        }
    }

    data class CardItem(val image: Int, val title: String, val description: String)
}