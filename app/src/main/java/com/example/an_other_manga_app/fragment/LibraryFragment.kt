package com.example.an_other_manga_app.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.an_other_manga_app.R
import com.example.an_other_manga_app.adapter.MangaAdapter
import com.example.an_other_manga_app.viewmodel.LibraryViewModel

class LibraryFragment : Fragment() {

    private lateinit var viewModel: LibraryViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MangaAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_library, container, false)

        viewModel = ViewModelProvider(this)[LibraryViewModel::class.java]

        val sampleData = viewModel.getSampleData()

        recyclerView = view.findViewById(R.id.recyclerView)
        adapter = MangaAdapter(sampleData)

        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerView.adapter = adapter

        return view
    }
}