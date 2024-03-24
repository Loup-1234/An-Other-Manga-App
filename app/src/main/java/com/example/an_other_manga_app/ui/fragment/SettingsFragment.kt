package com.example.an_other_manga_app.ui.fragment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.an_other_manga_app.R
import com.example.an_other_manga_app.ui.theme.AnOtherMangaAppTheme

@Composable
fun SettingsFragment(navController: NavHostController) {
    AnOtherMangaAppTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.surface)
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(1),
                contentPadding = PaddingValues(8.dp)
            ) {
                item {
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                        ),
                        modifier = Modifier
                            .clickable { navController.navigate("manga") }
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.mipmap.lifetime_showtime),
                            contentDescription = "Extreme Violence",
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxSize()
                        )
                        Text(
                            text = "Lifetime Showtime",
                            fontSize = 24.sp,
                            modifier = Modifier
                                .padding(
                                    start = 8.dp,
                                    end = 8.dp
                                ),
                            color = MaterialTheme.colorScheme.secondary
                        )
                        Text(
                            text = "FUWAMOCO",
                            fontSize = 18.sp,
                            modifier = Modifier
                                .padding(
                                    start = 8.dp,
                                    end = 8.dp,
                                    bottom = 8.dp
                                ),
                            color = MaterialTheme.colorScheme.secondary
                        )
                    }
                }
                item {
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                        ),
                        modifier = Modifier
                            .clickable { navController.navigate("manga") }
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "[Intro: FUWAMOCO, Fuwawa, Mococo]\n" +
                                    "It's show time\n" +
                                    "一緒にいたいよ\n" +
                                    "Lifetime, showtime\n" +
                                    "Any time, bau-bau\n" +
                                    "Yeah, future is bright (Yeah, 二人は)\n" +
                                    "Fluffy, fuzzy, yappy sisters",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(8.dp),
                            color = MaterialTheme.colorScheme.secondary
                        )
                    }
                }
                item {
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                        ),
                        modifier = Modifier
                            .clickable { navController.navigate("manga") }
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "[Refrain: Fuwawa, Mococo, FUWAMOCO]\n" +
                                    "Fuwa, Moco\n" +
                                    "Fuwa, Moco\n" +
                                    "Fuwa, Moco\n" +
                                    "Fuwa, Moco, bau-bau-bau-bau",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(8.dp),
                            color = MaterialTheme.colorScheme.secondary
                        )
                    }
                }
                item {
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                        ),
                        modifier = Modifier
                            .clickable { navController.navigate("manga") }
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "[Verse: Fuwawa]\n" +
                                    "My heart 'n soul 'n tail are (Fuwawa, yay)\n" +
                                    "I'm so fluffy that even I could float away\n" +
                                    "If you call for me, we're only a bark away\n" +
                                    "Your smile is the treasure that I wanna keep safe",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(8.dp),
                            color = MaterialTheme.colorScheme.secondary
                        )
                    }
                }
                item {
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                        ),
                        modifier = Modifier
                            .clickable { navController.navigate("manga") }
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "[Pre-Chorus: Mococo, FUWAMOCO]\n" +
                                    "I love being tricky\n" +
                                    "Doggie kisses are for me\n" +
                                    "I love lots of walkies\n" +
                                    "Don't need no leashes for me\n" +
                                    "Silly puppy Mococo\n" +
                                    "Will follow you anywhere\n" +
                                    "FUWAMOCO together\n" +
                                    "Take us along with you\n" +
                                    "Barking, oh, so merrily",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(8.dp),
                            color = MaterialTheme.colorScheme.secondary
                        )
                    }
                }
                item {
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                        ),
                        modifier = Modifier
                            .clickable { navController.navigate("manga") }
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "[Chorus: FUWAMOCO, Fuwawa, Mococo]\n" +
                                    "It's show time\n" +
                                    "一緒にいたいよ\n" +
                                    "Lifetime, showtime\n" +
                                    "Any timе, bau-bau\n" +
                                    "一生涯 Sing with you\n" +
                                    "Stars wink, moon spotlight\n" +
                                    "Furr-ever glow\n" +
                                    "It's show time\n" +
                                    "一緒にいたいよ\n" +
                                    "Lifеtime, showtime\n" +
                                    "Any time, bau-bau\n" +
                                    "Yeah, future is bright (Yeah, 二人は)\n" +
                                    "Fluffy, fuzzy, yappy sisters",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(8.dp),
                            color = MaterialTheme.colorScheme.secondary
                        )
                    }
                }
                item {
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                        ),
                        modifier = Modifier
                            .clickable { navController.navigate("manga") }
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "[Refrain: Fuwawa, Mococo]\n" +
                                    "Fuwa, Moco\n" +
                                    "Fuwa, Moco\n" +
                                    "Fuwa, Moco\n" +
                                    "Fuwa, Moco\n" +
                                    "Fuwa, Moco",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(8.dp),
                            color = MaterialTheme.colorScheme.secondary
                        )
                    }
                }
                item {
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                        ),
                        modifier = Modifier
                            .clickable { navController.navigate("manga") }
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "[Outro: FUWAMOCO]\n" +
                                    "FUWAMOCO, bau-bau\n" +
                                    "FUWAMOCO, bau-bau",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(8.dp),
                            color = MaterialTheme.colorScheme.secondary
                        )
                    }
                }
            }
        }
    }
}