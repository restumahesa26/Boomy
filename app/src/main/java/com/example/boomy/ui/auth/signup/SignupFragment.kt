package com.example.boomy.ui.auth.signup

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.example.boomy.R
import com.example.boomy.ui.MainActivity
import com.example.boomy.ui.auth.AuthActivity
import kotlinx.android.synthetic.main.fragment_signup.*

class SignupFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnRegister.setOnClickListener {
            val home = Intent(activity, MainActivity::class.java)
            startActivity(home)
            activity?.finish()
        }

        btnHaveRegister.setOnClickListener {
            val signin = Intent(activity, AuthActivity::class.java)
            startActivity(signin)
        }
    }
}