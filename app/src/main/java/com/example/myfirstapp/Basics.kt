package com.example.myfirstapp

fun main(){

    //use of the arrays

    val number= arrayOf(1,2,3,4,5)
    print(number.contentToString())

    for (elements in number){
        print("${elements+3}")
    }
    val dNum= arrayOf(1.0,2.0,3.0,4.0,5.0,6.0)
    print(dNum.contentToString())
    for (elements in dNum){
        print(elements)
    }
    var a= arrayOf("nabeel","aqeel","tanveer",5)
    a[0]="ghulam hussain"
    print("\n${a.contentToString()}" )

   //Use of the lists

    val days= listOf("mon","tue","wed",6,0)
    //what[2]="Somehing"
     val newdays=days.toMutableList()
    val day= arrayOf("thu","fri")
    newdays.addAll(day)
    print(newdays)
    val month= mutableListOf<String>("jan","fab","mar")
    month.add("apr")
    month[2]="what"
    month.removeAt(2)

    val months= listOf("fab","mar")
    month.removeAll(months)
    print(month)

    //use of sets and maps

    val color= setOf("white","black","red","white")

    val newcolor=color.toMutableList()
    newcolor.add("yellow")
   newcolor[2]="offwhite";
    print(newcolor)

    val prayers= mapOf(1 to "fajar", 2 to "zohar",3 to "asar")
    for (what in prayers.keys)
    print("$what  to the ${prayers[what]}")
}