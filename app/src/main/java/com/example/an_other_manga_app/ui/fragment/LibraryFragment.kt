package com.example.an_other_manga_app.ui.fragment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.an_other_manga_app.R
import com.example.an_other_manga_app.ui.navigation.SettingsButton
import com.example.an_other_manga_app.ui.navigation.TopSearchBar
import com.example.an_other_manga_app.ui.theme.AnOtherMangaAppTheme
import kotlinx.coroutines.delay

@Composable
fun LibraryFragment(navController: NavHostController) {
    AnOtherMangaAppTheme {
        val items = generateInfiniteListOfItems()

        Column {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(8.dp)
            ) {
                item(span = { GridItemSpan(2) }) {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        TopSearchBar()
                        Spacer(modifier = Modifier.width(8.dp))
                        SettingsButton()
                    }
                }

                items(items) { index ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = MaterialTheme.colorScheme.surface),
                        contentAlignment = Alignment.Center
                    ) {
                        Card(
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.surfaceVariant,
                            ),
                            modifier = Modifier
                                .clickable { navController.navigate("manga") }
                                .width(200.dp)
                                .height(250.dp)
                                .padding(8.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Image(
                                    painter = painterResource(id = R.mipmap.extreme_violence),
                                    contentDescription = "Extreme Violence",
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .fillMaxSize()
                                        .align(Alignment.Center)
                                )
                                Text(
                                    text = "Manga $index",
                                    modifier = Modifier
                                        .padding(8.dp),
                                    textAlign = TextAlign.Center,
                                    color = MaterialTheme.colorScheme.secondary
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

data class Item(val id: Int)

@Composable
fun generateInfiniteListOfItems(): List<Item> {

    val items = remember { mutableStateListOf<Item>() }

    LaunchedEffect(Unit) {
        var index = 0
        while (true) {
            items.add(Item(index++))
            delay(500)
        }
    }

    return items
}