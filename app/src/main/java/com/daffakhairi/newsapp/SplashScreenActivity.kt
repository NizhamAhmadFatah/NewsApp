package com.daffakhairi.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Menghubungkan halaman dengan main activity
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}