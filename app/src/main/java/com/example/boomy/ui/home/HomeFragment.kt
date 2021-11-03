package com.example.boomy.ui.home

import android.content.Intent
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
import com.example.boomy.model.HomeModel
import com.example.boomy.ui.MainActivity
import com.example.boomy.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), HomeAdapter.ItemAdapterCallback {

    private var musicList : ArrayList<HomeModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = HomeAdapter(musicList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rcListMusic.layoutManager = layoutManager
        rcListMusic.adapter = adapter
    }

    fun initDataDummy() {
        musicList = ArrayList()
        musicList.add(HomeModel("To The Bone", "Pamungkas"))
        musicList.add(HomeModel("Happier Than Ever", "Billie Elish"))
        musicList.add(HomeModel("Cinta Dan Rahasia", "Yura Yunita"))
        musicList.add(HomeModel("Kamu Harus Pulang", "Slank"))
        musicList.add(HomeModel("Easy On Me", "Adele"))
        musicList.add(HomeModel("Stay", "The Kid Larroy & Justin Bieber"))
        musicList.add(HomeModel("Double Take", "Dhruv"))
        musicList.add(HomeModel("Happier", "Olivia Rodrigo"))
        musicList.add(HomeModel("Talking To The Bone", "Bruno Mars"))
        musicList.add(HomeModel("Memories", "Maroon 5"))
        musicList.add(HomeModel("Comethru", "Jeremy Zucker"))
        musicList.add(HomeModel("Don't Give Up on Me", "Andy Grammer"))
        musicList.add(HomeModel("Before You Go", "Lewis Capaldi"))
        musicList.add(HomeModel("Imagination", "Shawn Mendes"))
    }

    override fun onClick(v: View, data: HomeModel) {
        val detail = Intent(activity, DetailActivity::class.java)
        detail.putExtra("judul", "KKK")
        startActivity(detail)
    }
}