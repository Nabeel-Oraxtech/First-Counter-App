package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         //Log.d("my activity", "output to the logcat")
        val clickButton = findViewById<Button>(R.id.clkbtn)
        val tv1 = findViewById<TextView>(R.id.textView)
        var clicks = 0;
        clickButton.setOnClickListener {
            clicks = clicks + 1;
            tv1.text = clicks.toString();

        }


        //Use of if else and other logical operators
        var person1 = 190;
        var person2 = 190;
        if (person1 > person2){
            println("person1 is powerfull")
        }
        else if (person1==person2){
            println("Both are powerfull")
        }
        else{
            println("Person2 is powerfull")
        }

        //use of if else statements as an expression
        val age=22
        val drinkAge=18
        val votingAge=17;
        val overage=30
        val currentage=if(age>=drinkAge){
            println("u can drink in usa")
        }
        else if (age>=votingAge){
            println("u can cast a vote")
        }
        else if (age>=overage){
            println("sorry u r overage")
        }
        else{
            println("you r so young")
        }

    }
}