package com.example.bookstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.bookstore.R

class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long=3000 // 3 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
//
//        val handler = Handler()
//
//        handler.postDelayed({
//            val intent = Intent(this@SplashScreenActivity, MainActivity::class.java)
//            startActivity(intent)
//            finishAffinity()
//        }, 3000)
        Handler().postDelayed({
                // This method will be executed once the timer is over
                // Start your app main activity

                startActivity(Intent(this,MainActivity::class.java))

                // close this activity
                finish()
            }, SPLASH_TIME_OUT)
        }


}