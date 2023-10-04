package com.example.projectbp2678

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnBookKid:Button = findViewById(R.id.buttonmenu1)

        btnBookKid.setOnClickListener {
            val intentBookKid = Intent(this, BookKidActivity::class.java)
            startActivity(intentBookKid)
        }
    }
}