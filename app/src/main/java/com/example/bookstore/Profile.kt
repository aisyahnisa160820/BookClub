package com.example.bookstore


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bookstore.fragments.FragmentA
import com.example.bookstore.fragments.FragmentB



class Profile : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val intent = intent
        val user = intent.getStringExtra("Username")


        val fragmentA = FragmentA()
        val fragmentB = FragmentB()
        supportFragmentManager.beginTransaction().replace(R.id.body_fragment,fragmentB).commit()


    }

    override fun passDataCom(editTextInput: String) {
        val bundle =Bundle()

        bundle.putString("message", editTextInput)
        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentB = FragmentB()
        fragmentB.arguments = bundle

        transaction.replace(R.id.body_fragment, fragmentB)
        transaction.commit()
    }



}
