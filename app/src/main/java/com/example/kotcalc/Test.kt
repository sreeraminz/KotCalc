package com.example.kotcalc

fun main(args:Array<String>){
    con1 {
        println(it)
        println(this)
        length
    }
}

fun con1(abc:String.(Int)->Unit){
    val a:String = "D"
    a.let {

    }
    abc("s",1)
}

class T1{
    fun idea(){

    }
}
class T2{
    fun idea(){

    }

    fun check(){
        val obj = T1()
        obj.apply {
            idea()
            idea()
        }
    }
}