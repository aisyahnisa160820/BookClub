package com.example.bookstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.bookstore.fragments.FragmentB

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.username)
        val email = findViewById<EditText>(R.id.email)
        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener{

            val user = username.text.toString()
            val email = email.text.toString()


            val intent = Intent (this@MainActivity, MenuPage::class.java)
            intent.putExtra("Username", user)
            intent.putExtra("Email",email)
            startActivity(intent)



        }



    }
}