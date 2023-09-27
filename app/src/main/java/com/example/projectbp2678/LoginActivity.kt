package com.example.projectbp2678

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin:Button = findViewById(R.id.buttonLogin)
        val txtUsername:EditText = findViewById(R.id.editTextUsername)
        val txtPassword:EditText = findViewById(R.id.editTextPassword)
        val logModel = LoginModel()

        btnLogin.setOnClickListener(){
            logModel.username = txtUsername.text.toString()
            logModel.password = txtPassword.text.toString()

            if(logModel.loginCek() == true){
                //call homepage
                val intenthome = Intent(this, HomeActivity::class.java)
                startActivity(intenthome)
            }else{
                Toast.makeText(this, "Login gagal, cek username dan password",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}