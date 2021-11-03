package com.example.boomy.ui.setting

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
import com.example.boomy.ui.auth.AuthActivity
import com.example.boomy.ui.splashscreen.SplashScreenActivity
import kotlinx.android.synthetic.main.fragment_setting.*

class SettingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_setting, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnLogout.setOnClickListener {
            val splash = Intent(activity, SplashScreenActivity::class.java)
            startActivity(splash)
            activity?.finish()
        }
    }
}