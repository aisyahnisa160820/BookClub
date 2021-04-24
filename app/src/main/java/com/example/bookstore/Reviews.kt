package com.example.bookstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.bookstore.databinding.ActivityReviewsBinding
import com.example.bookstore.R
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import com.example.bookstore.adapter.BookGridAdapter
import com.example.bookstore.entity.BookData


class Reviews : AppCompatActivity() {
    private lateinit var binding: ActivityReviewsBinding
    private lateinit var bookAdapter: BookGridAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reviews)
        val intent = intent

            binding = ActivityReviewsBinding.inflate(layoutInflater)
            setContentView(binding.root)
            binding.RecView.layoutManager = GridLayoutManager(this, 3)
            bookAdapter = BookGridAdapter(BookData.listBook)
            binding.RecView.adapter = bookAdapter



    }
    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}