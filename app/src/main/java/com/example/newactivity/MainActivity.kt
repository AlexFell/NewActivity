package com.example.newactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Click(view: android.view.View) {
        intent = Intent(this, PicActivity::class.java)
        intent.putExtra("picLink", "https://i11.fotocdn.net/s126/d2fcc5e286da0409/gallery_xl/2864966509.jpg")
        startActivity(intent)
    }
}