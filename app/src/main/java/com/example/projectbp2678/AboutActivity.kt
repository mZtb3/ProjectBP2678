package com.example.projectbp2678

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val imgCall:ImageView = findViewById(R.id.imageViewCall)
        imgCall.setOnClickListener(){
            val callIntent:Intent = Url.parse("tel.")
        }
    }
}