package com.example.bookstore

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.bookstore.databinding.ActivityReviewsDetailBinding
import com.example.bookstore.R
import com.example.bookstore.entity.Book



class ReviewsDetail : AppCompatActivity() {

    private lateinit var binding : ActivityReviewsDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reviews_detail)
        binding = ActivityReviewsDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataBook = intent.getParcelableExtra<Book>("Book_Data")
        binding.describeBook.text = dataBook?.describeBook.toString()
        binding.nameBook.text = dataBook?.nameBook.toString()
        binding.backIcon.setOnClickListener {
            val intent = Intent(this, Reviews::class.java)
            startActivity(intent)
            finish()
        }
        Glide.with(this)
            .load(dataBook?.imgBook)
            .apply(RequestOptions().override(450,450))
            .into(binding.BookImg)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}