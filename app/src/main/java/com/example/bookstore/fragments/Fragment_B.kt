package com.example.bookstore.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bookstore.R
import com.example.bookstore.fragments.FragmentA
import kotlinx.android.synthetic.main.fragment_b.view.*


class Fragment_B : Fragment() {
    var displayMessage: String? =""


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_b, container, false)

        view.button.setOnClickListener{
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            if (transaction != null) {
                transaction.replace(R.id.body_fragment, FragmentA())
                transaction.commit()
            }

        }

        displayMessage=arguments?.getString("message")

        view.displayMessage.text=displayMessage
        return view
    }
}