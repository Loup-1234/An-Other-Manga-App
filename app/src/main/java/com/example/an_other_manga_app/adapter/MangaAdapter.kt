package com.example.an_other_manga_app.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.an_other_manga_app.R
import com.example.an_other_manga_app.viewmodel.MangaItem

class MangaAdapter(private val context: Context, private val dataList: List<MangaItem>) : BaseAdapter() {

    override fun getCount(): Int {
        return dataList.size
    }

    override fun getItem(position: Int): Any {
        return dataList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_manga, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val item = getItem(position) as MangaItem
        viewHolder.titleTextView.text = item.title
        Glide.with(context)
            .load(item.imageUrl)
            .placeholder(R.drawable.extreme_violence)
            .into(viewHolder.imageView)

        return view
    }

    private class ViewHolder(view: View) {
        val titleTextView: TextView = view.findViewById(R.id.item_card_title)
        val imageView: ImageView = view.findViewById(R.id.item_card_image)
    }
}