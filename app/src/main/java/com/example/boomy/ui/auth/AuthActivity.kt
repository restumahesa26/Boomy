package com.example.boomy.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.example.boomy.R

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val pagerequest = intent.getIntExtra("page_request", 0)
        if (pagerequest == 2) {
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.fragmentSignin, true)
                .build()

            Navigation.findNavController(findViewById(R.id.authHostFragment))
                .navigate(R.id.action_fragment_signup, null, navOptions)
        }
    }
}