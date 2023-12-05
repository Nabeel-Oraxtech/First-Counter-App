package com.example.myfirstapp

import android.util.Log

fun main(){
    val newArrayList= arrayListOf<Double>(1.2,3.6,6.8,4.7,4.6,9.6)
    var total=0.0;
    for (i in newArrayList){
       total=total+i;
    }
    var newtotal=total/5
    print("Average of the numbers is $newtotal")

    //Lambda Expressions

    Log.d("msg","output")
     val sum: (Int,Int) -> Int = {a, b -> a+b}

            println(sum(4,7));
}
