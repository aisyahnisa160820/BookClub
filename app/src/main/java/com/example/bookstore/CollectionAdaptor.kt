package com.example.bookstore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CollectionAdaptor(val img:Array<Int>,val text:Array<String>,val desc:Array<String>): RecyclerView.Adapter<CollectionAdaptor.CustomViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CollectionAdaptor.CustomViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(v)
    }

    override fun getItemCount(): Int {
        return text.size
    }

    override fun onBindViewHolder(holder: CollectionAdaptor.CustomViewHolder, position: Int) {
        holder.bindValue(img[position],text[position],desc[position])
    }

    //    our coustomeviewholder should inherit recyclerview.viewholder
    //and it will receive item view from here
    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        //since we are getting this view using this we can also get
        // text1, text2

        fun bindValue(image: Int,txt: String, desc:String){
            itemView.findViewById<ImageView>(R.id.book).setImageResource(image)
            itemView.findViewById<TextView>(R.id.text1).text = txt
            itemView.findViewById<TextView>(R.id.text2).text = desc
        }

    }
}
