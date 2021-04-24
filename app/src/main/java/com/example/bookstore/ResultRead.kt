package com.example.bookstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class ResultRead : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_read)

        val containerL : LinearLayout = findViewById(R.id.containerL)
        val ReadValueTV : TextView = findViewById(R.id.ReadValueTV)
        val ReadFlagImgView : ImageView = findViewById(R.id.ReadFlagImgView)
        val ReadLabelTV : TextView = findViewById(R.id.ReadLabelTV)
        val commentTV : TextView = findViewById(R.id.commentTV)
        val advice1IMG : ImageView = findViewById(R.id.advice1IMG)
        val advice1TV : TextView = findViewById(R.id.advice1TV)
        val advice2IMG : ImageView = findViewById(R.id.advice2IMG)
        val advice2TV : TextView = findViewById(R.id.advice2TV)
        val advice3IMG : ImageView = findViewById(R.id.advice3IMG)
        val advice3TV : TextView = findViewById(R.id.advice3TV)

        val result = intent.getDoubleExtra("result", -1.0)
        if (result == -1.0) {
            containerL.visibility= View.GONE
        }else {
            ReadValueTV.text = result.toString()
            if (result < 200 ) {
                containerL.setBackgroundResource(R.color.red)
                ReadFlagImgView.setImageResource(R.drawable.snail)
                ReadLabelTV.text = "Your Reading Speed is Slow"
                commentTV.text = "Here are some advices To help you increase your reading speed"
                advice1IMG.setImageResource(R.drawable.distraction)
                advice1TV.text = "Avoid distractions "
                advice2IMG.setImageResource(R.drawable.speedometer)
                advice2TV.text = "Go Easy"
                advice3IMG.setImageResource(R.drawable.norun)
                advice3TV.text = "Do not rush yourself"
            }
            else if(result < 400) {
                containerL.setBackgroundResource(R.color.orange)
                ReadFlagImgView.setImageResource(R.drawable.turtle)
                ReadLabelTV.text = "Your Reading Speed is Moderate"
                commentTV.text = "Here are some advices to help you increase your reading speed"
                advice1IMG.setImageResource(R.drawable.reading)
                advice1TV.text = "Know what you want from the text "
                advice2IMG.setImageResource(R.drawable.letter)
                advice2TV.text = "Cover the words that you've already read"
                advice3IMG.setImageResource(R.drawable.goal)
                advice3TV.text = "Practice more"
            }
            else if(result < 600) {
                containerL.setBackgroundResource(R.color.green)
                ReadFlagImgView.setImageResource(R.drawable.deer)
                ReadLabelTV.text = "Your Reading Speed is Great"
                commentTV.text = "Here are some advices to help you maintain your reading speed"
                advice1IMG.setImageResource(R.drawable.speedometer)
                advice1TV.text = "Benchmark your progress"
                advice2IMG.setImageResource(R.drawable.letter)
                advice2TV.text = "Set a Goal"
                advice3IMG.setImageResource(R.drawable.reading)
                advice3TV.text = "Improve your vocabulary"
            }

            else {
                if (result < 700) {
                    containerL.setBackgroundResource(R.color.blue)
                    ReadFlagImgView.setImageResource(R.drawable.cheetah)
                    ReadLabelTV.text="Your Reading Speed is Excelent"
                    commentTV.text="Here are some advices To help you maintain your reading speed"
                    advice1IMG.setImageResource(R.drawable.letter)
                    advice1TV.text="Use a Marker"
                    advice2IMG.setImageResource(R.drawable.speedometer)
                    advice2TV.text="Skim the Main Points First"
                    advice3IMG.setImageResource(R.drawable.reading)
                    advice3TV.text="Use peripheral vision"
                }
            }
        }
    }
}