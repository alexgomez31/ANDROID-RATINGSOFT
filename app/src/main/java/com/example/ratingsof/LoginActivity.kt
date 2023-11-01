package com.example.ratingsof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun irASecondActivity(view: View) {
        val intent = Intent(this, ActivityVista::class.java)
        startActivity(intent)
    }


}
