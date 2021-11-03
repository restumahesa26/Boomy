package com.example.boomy.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.boomy.R
import kotlinx.android.synthetic.main.fragment_detail.*


class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnBack.setOnClickListener {
            activity?.finish()
        }

        tooglebutton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                ivMusicKeren.visibility = View.INVISIBLE
                tvLirik.visibility = View.VISIBLE
            } else {
                ivMusicKeren.visibility = View.VISIBLE
                tvLirik.visibility = View.INVISIBLE
            }
        }
    }
}