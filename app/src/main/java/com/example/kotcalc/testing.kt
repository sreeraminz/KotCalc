package com.example.kotcalc

class mySet{
    private val set = arrayOf(30,69,67)
    public fun filter(pred:(()->Array<Int>)):Array<Int>{
        return pred()
    }
}