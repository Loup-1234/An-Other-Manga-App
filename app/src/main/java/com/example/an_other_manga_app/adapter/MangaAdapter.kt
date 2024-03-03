package com.example.an_other_manga_app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.an_other_manga_app.R
import com.example.an_other_manga_app.model.MangaItem
class MangaAdapter(private val dataList: List<MangaItem>) : RecyclerView.Adapter<MangaAdapter.MangaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_manga, parent, false)
        return MangaViewHolder(view)
    }

    override fun onBindViewHolder(holder: MangaViewHolder, position: Int) {
        val item = dataList[position]
        holder.titleTextView.text = item.title
        holder.descriptionTextView.text = item.description
        Glide.with(holder.itemView.context)
            .load(item.imageUrl)
            .placeholder(R.mipmap.extreme_violence)
            .into(holder.imageView)
    }

    override fun getItemCount() = dataList.size

    inner class MangaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.item_card_title)
        val descriptionTextView: TextView = itemView.findViewById(R.id.item_card_description)
        val imageView: ImageView = itemView.findViewById(R.id.item_card_image)
    }
}