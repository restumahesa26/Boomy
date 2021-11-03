package com.example.boomy.ui.music

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.boomy.R
import com.example.boomy.ui.MainActivity
import com.example.boomy.ui.auth.AuthActivity
import kotlinx.android.synthetic.main.fragment_setting.*

class MusicFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_music,container, false)
        return root
    }
}