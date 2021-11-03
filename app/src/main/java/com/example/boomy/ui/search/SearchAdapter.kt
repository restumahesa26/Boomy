package com.example.boomy.ui.search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.boomy.R
import com.example.boomy.model.HomeModel
import com.example.boomy.model.SearchModel
import kotlinx.android.synthetic.main.item_music_vertical.view.*
import kotlinx.android.synthetic.main.item_music_vertical.view.tvJudul
import kotlinx.android.synthetic.main.item_search_vertical.view.*

class SearchAdapter (
    private val listData : List<SearchModel>,
    private val itemAdapterCallback : ItemAdapterCallback
) : RecyclerView.Adapter<SearchAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_search_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: SearchAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data : SearchModel, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvJudul_1.text = data.judul_1
                tvJudul_2.text = data.judul_2

                itemView.setOnClickListener { itemAdapterCallback.onClick(it, data) }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data:SearchModel)
    }
}