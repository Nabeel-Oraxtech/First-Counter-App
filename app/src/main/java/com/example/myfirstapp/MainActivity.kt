package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickButton = findViewById<Button>(R.id.clkbtn)
        val tv1 = findViewById<TextView>(R.id.textView)
        var clicks = 0;
        clickButton.setOnClickListener {
            clicks = clicks + 1;
            tv1.text = clicks.toString();
        }


        //Use of if else and other logical operators
        var person1 = 180;
        var person2 = 190;
        if (person1 > person2){
            println("person1 is powerfull")
        }
        else{
            println("Person2 is powerfull")
        }
    }
}