package com.example.bookstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_read.*
import java.math.BigDecimal
import java.math.RoundingMode


class Read : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read)
        val button_cal : Button = findViewById(R.id.callculate)
        button_cal.setOnClickListener{
            val words = findViewById<EditText>(R.id.Words)
            val line = findViewById<EditText>(R.id.Line)
            val time = findViewById<EditText>(R.id.Time)
            if (words.text.isNotEmpty() && line.text.isNotEmpty() && time.text.isNotEmpty()) {
                val word = words.text.toString().toDouble()
                val lines= line.text.toString().toDouble()
                val times= time.text.toString().toDouble()

                if (word > 0 && lines > 0 && times > 0) {
                    val intent = Intent (this@Read, ResultRead::class.java )
                    intent.putExtra("result", calculateRead(word,lines,times))
                    startActivity(intent)
                }
                else {
                    when {
                        words.text.isEmpty() -> {
                            words.error = "Please Input the word"
                        }
                        line.text.isEmpty() -> {
                            line.error = "Please Input the lines"
                        }
                        time.text.isEmpty() -> {
                            time.error = "Please Input the times"
                        }
                    }

                }
            }

        }
    }

    private fun calculateRead (word : Double, lines : Double , times : Double) = BigDecimal((((word/2) * lines )/ times)*60).setScale(2, RoundingMode.HALF_EVEN).toDouble()
}


