package com.example.boomy.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.boomy.R
import com.example.boomy.model.SearchModel
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment : Fragment(), SearchAdapter.ItemAdapterCallback {

    private var searchList : ArrayList<SearchModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_search, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = SearchAdapter(searchList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rcListSearch.layoutManager = layoutManager
        rcListSearch.adapter = adapter
    }

    fun initDataDummy() {
        searchList = ArrayList()
        searchList.add(SearchModel("Podcast", "New Release"))
        searchList.add(SearchModel("Charts", "Concerts"))
        searchList.add(SearchModel("Acoustics", "Instrumen"))
    }

    override fun onClick(v: View, data: SearchModel) {
        Toast.makeText(context, "Anda Mengklik Search", Toast.LENGTH_SHORT).show()
    }
}