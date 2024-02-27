package com.example.an_other_manga_app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.fragment.app.Fragment
import com.example.an_other_manga_app.R
import com.example.an_other_manga_app.adapter.MangaAdapter
import com.example.an_other_manga_app.model.MangaItem

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
            MangaItem("Manga 3", "https://example.com/image3.jpg", "Description 3")
        )
    }
}
