package com.example.bookstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MenuPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_page)
        val intent = intent
        val user = intent.getStringExtra("Username")
        val email = intent.getStringExtra("Email")
        val button_collection = findViewById<Button>(R.id.Collection)
        val button_read = findViewById<Button>(R.id.Read)
        val button_review = findViewById<Button>(R.id.Review)
        val ResTv = findViewById<TextView>(R.id.Name)
        val profile = findViewById<Button>(R.id.Profile)

        ResTv.text = "Welcome " + user + "\n" + email
        
        button_collection.setOnClickListener {
            val intent = Intent (this@MenuPage, Collection::class.java)
                startActivity(intent)
        }

        button_read.setOnClickListener {
            val intent = Intent (this@MenuPage, Read::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener {
            val intent = Intent(this@MenuPage, Profile::class.java)
            startActivity(intent)

        }

        button_review.setOnClickListener {
            val intent = Intent (this@MenuPage, Reviews::class.java)
            startActivity(intent)
        }



    }
}