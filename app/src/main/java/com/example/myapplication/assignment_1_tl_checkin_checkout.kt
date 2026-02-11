package com.example.myapplication
import com.example.myapplication.R

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class assignment_1_tl_checkin_checkout: AppCompatActivity() { //inheretance
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.assign_1_checkin_out)
        val checkincoming: Button =findViewById(R.id.checkin)
        val checkoutgoing: Button =findViewById(R.id.checkout)
        val text: TextView = findViewById(R.id.text)
        var res=0
        checkincoming.setOnClickListener{
//            var n=checkincoming.text.toString().toIntOrNull()?:0
              res++
            text.text=res.toString()

        }
        checkoutgoing.setOnClickListener {
            if(res>0) {
                res--
                text.text = res.toString()
        }
    }}}

