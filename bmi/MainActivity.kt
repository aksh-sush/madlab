package com.example.bmi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//Create an app that calculates the Body Mass Index (BMI) based on user input for weight and height in EditText fields. The result is displayed in a TextView after pressing a Button.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val height : EditText=findViewById(R.id.height)
        val weight : EditText=findViewById(R.id.weight)
        val click : Button =findViewById(R.id.click)
        val bmi : TextView =findViewById(R.id.bmi)

        click.setOnClickListener {

        if(height.text.toString().toDouble() !=0.0 && weight.text.toString().toDouble() !=0.0){
        val bmicaloc = weight.text.toString().toDouble()/(height.text.toString().toDouble()*height.text.toString().toDouble())
//            Toast.makeText(this, "Your BMI is $bmi", Toast.LENGTH_LONG).show()
            bmi.text = String.format("Your BMI: %.2f ", bmicaloc)

        }
        else{
            Toast.makeText(this, "Height & weight must be greater than 0", Toast.LENGTH_SHORT).show()

        }}

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}