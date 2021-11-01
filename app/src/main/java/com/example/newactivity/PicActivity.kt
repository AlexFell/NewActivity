package com.example.newactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

import android.view.View


class PicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pic_layout)


        val link = intent.getStringExtra("picLink")
        val imageView = findViewById<View>(R.id.picView) as ImageView

        Glide.with(this).load(link).into(imageView)

    }
}