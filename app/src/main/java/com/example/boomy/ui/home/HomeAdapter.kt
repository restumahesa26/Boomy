package com.example.boomy.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.boomy.R
import com.example.boomy.model.HomeModel
import kotlinx.android.synthetic.main.item_music_vertical.view.*

class HomeAdapter (
    private val listData : List<HomeModel>,
    private val itemAdapterCallback : ItemAdapterCallback
) : RecyclerView.Adapter<HomeAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_music_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data : HomeModel, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvJudul.text = data.judul
                tvPenyanyi.text = data.penyanyi

                itemView.setOnClickListener { itemAdapterCallback.onClick(it, data) }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data:HomeModel)
    }
}