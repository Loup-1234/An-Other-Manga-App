package com.example.an_other_manga_app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.an_other_manga_app.databinding.FragmentBrowseBinding
import com.example.an_other_manga_app.viewmodel.BrowseViewModel

class BrowseFragment : Fragment() {

    private var _binding: FragmentBrowseBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val browseViewModel =
            ViewModelProvider(this)[BrowseViewModel::class.java]

        _binding = FragmentBrowseBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textBrowse
        browseViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}