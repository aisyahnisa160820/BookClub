package com.example.bookstore


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Collection : AppCompatActivity() {

    private val texts = arrayOf("The Song of Achilles","Six of Crows","Percy Jackson","Inferno","Harry Potter","Aristotale")
    private val desc = arrayOf("Madeline Miller","Leigh Bardugo","Rick Riordan","Dan Brown","J.K Rowling","Benjamin A Saenz")
    private val img = arrayOf(R.drawable.tsoa,R.drawable.soc,R.drawable.pj1,R.drawable.inferno,R.drawable.hp2
        ,R.drawable.andtsu)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collection)
        val intent = intent

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CollectionAdaptor(img,texts,desc)
    }

}