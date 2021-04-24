package com.example.bookstore.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.bookstore.ReviewsDetail
import com.example.bookstore.R
import com.example.bookstore.entity.Book
import com.example.bookstore.entity.BookData.listBook

class BookGridAdapter(private val listBook: ArrayList<Book>):RecyclerView.Adapter<BookGridAdapter.BookViewHolder>() {
    inner class BookViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

    val imgbook =  itemView.findViewById<ImageView>(R.id.imageBook)
    val namebook = itemView.findViewById<TextView>(R.id.textBook)

    fun bind (book: Book){
        namebook.text = book.nameBook
        Glide.with(itemView.context)
                .load(book.imgBook)
                .apply(RequestOptions().override(350,350))
                .into(imgbook)
        itemView.setOnClickListener {
            val intent = Intent(itemView.context, ReviewsDetail::class.java)
            intent.putExtra("Book_Data", book)
            itemView.context.startActivity(intent)
        }
    }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itembook, parent, false)
        return BookViewHolder(view)

    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bind(listBook[position])
    }
    override fun getItemCount(): Int = listBook.size

}