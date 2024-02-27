package com.example.an_other_manga_app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.fragment.app.Fragment
import com.example.an_other_manga_app.R
import com.example.an_other_manga_app.adapter.MangaAdapter
import com.example.an_other_manga_app.viewmodel.MangaItem

class LibraryFragment : Fragment() {

    private lateinit var gridView: GridView
    private lateinit var adapter: MangaAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_library, container, false)

        gridView = view.findViewById(R.id.gridView)
        adapter = MangaAdapter(requireContext(), getSampleData())
        gridView.adapter = adapter

        return view
    }

    private fun getSampleData(): List<MangaItem> {
        return listOf(
            MangaItem("Manga 1", "https://example.com/image1.jpg", "Description 1"),
            MangaItem("Manga 2", "https://example.com/image2.jpg", "Description 2"),
            MangaItem("Manga 3", "https://example.com/image3.jpg", "Description 3"),
            MangaItem("Manga 4", "https://example.com/image4.jpg", "Description 4"),
            MangaItem("Manga 5", "https://example.com/image5.jpg", "Description 5"),
            MangaItem("Manga 6", "https://example.com/image6.jpg", "Description 6"),
            MangaItem("Manga 7", "https://example.com/image7.jpg", "Description 7"),
            MangaItem("Manga 8", "https://example.com/image8.jpg", "Description 8"),
            MangaItem("Manga 9", "https://example.com/image9.jpg", "Description 9"),
            MangaItem("Manga 10", "https://example.com/image10.jpg", "Description 10")
        )
    }
}
