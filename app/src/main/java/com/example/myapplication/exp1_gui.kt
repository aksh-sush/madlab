package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class exp1_gui: AppCompatActivity() { //inheretance
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exp1_gui)
        val fontsize: Button = findViewById(R.id.button1)
        val font_colour: Button = findViewById(R.id.button2)
        val backgroundcolour: Button = findViewById(R.id.button3)
        val next: Button = findViewById(R.id.button4)
        var i=0
    fontsize.setOnClickListener {
        fontsize.textSize = fontsize.textSize + 5

    }
    font_colour.setOnClickListener {
        when (i){
            0->font_colour.setTextColor(Color.RED)
            1->font_colour.setTextColor(Color.BLUE)
            2->font_colour.setTextColor(Color.GREEN)
        }
        i=(i+1)%3

    }
    backgroundcolour.setOnClickListener {
        when (i){
            0->backgroundcolour.setBackgroundColor(Color.RED)
            1->backgroundcolour.setBackgroundColor(Color.BLUE)
            2->backgroundcolour.setBackgroundColor(Color.GREEN)
        }
        i=(i+1)%3
    }
   next.setOnClickListener {
       val intent = Intent(this, assignment_1_tl_checkin_checkout::class.java)
       startActivity(intent)
   }

}}