package com.example.an_other_manga_app.viewmodel

import androidx.lifecycle.ViewModel
import com.example.an_other_manga_app.model.MangaItem

class LibraryViewModel : ViewModel() {

    fun getSampleData(): List<MangaItem> {
        val dataList = mutableListOf<MangaItem>()

        for (i in 1..20) {
            val title = "Manga $i"
            val imageUrl = "https://example.com/image$i.jpg"
            val description = "Description $i"
            dataList.add(MangaItem(title, imageUrl, description))
        }

        return dataList
    }
}