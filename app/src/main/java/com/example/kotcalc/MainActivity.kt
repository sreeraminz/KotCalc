package com.example.kotcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display.setText("0")
        one.setOnClickListener { display.append("1") }
        two.setOnClickListener { display.append("2") }
        three.setOnClickListener { display.append("3") }
        four.setOnClickListener { display.append("4") }
        five.setOnClickListener { display.append("5") }
        six.setOnClickListener { display.append("6") }
        seven.setOnClickListener { display.append("7") }
        eight.setOnClickListener { display.append("8") }
        nine.setOnClickListener { display.append("9") }
        zero.setOnClickListener { display.append("0") }
        plus.setOnClickListener { display.append("+") }
        minus.setOnClickListener { display.append("-") }
        division.setOnClickListener { display.append("/") }
        into.setOnClickListener { display.append("X") }
        percentage.setOnClickListener { display.append("%") }
        equal.setOnClickListener { display.append("=") }
        decimal.setOnClickListener {
            //TODO: add a decimal imp
        }
        plus_minus.setOnClickListener {
            //TODO: add a plus_minus imp
        }
        correction.setOnClickListener {
            if (display.text.lastIndex >= 0)
                display.text = display.text.subSequence(0, display.text.lastIndex)
        }
        btn_c.setOnClickListener{
            display.text = "0"
        }

    }



}
val calcEngine = CalcEngine()
fun main(){
    singleDigitAddition()
    multiDigitAddition()

//    singleDigitSubtraction()
//    multiDigitSubtraction()
//
//    singleDigitMultiplication()
//    multiDigitMultiplication()
//
//    singleDigitDivision()
//    multiDigitDivision()
//
//    singleDigitPercentage()
//    multiDigitPercentage()
//
//    multiOperation()
    calcEngine.run {  }
    run{

    }

}
fun singleDigitAddition(){
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.PLUS())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.DOT())
    calcEngine.pushKey(KEY.SEVEN())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.PLUS())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.EQUAL())
    println(calcEngine.getDisplayString())
    //println(calcEngine.getResult())

}
fun multiDigitAddition(){
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.SEVEN())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.PLUS())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.PLUS())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.THREE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.EQUAL())
    println(calcEngine.getDisplayString())

}
fun singleDigitSubtraction(){
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.MINUS())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.MINUS())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.EQUAL())
    println(calcEngine.getDisplayString())

}
fun multiDigitSubtraction(){
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.SEVEN())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.MINUS())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.MINUS())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.THREE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.EQUAL())
    println(calcEngine.getDisplayString())

}
fun singleDigitMultiplication(){
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.INTO())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.INTO())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.EQUAL())
    println(calcEngine.getDisplayString())

}
fun multiDigitMultiplication(){
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.SEVEN())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.INTO())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.INTO())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.THREE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.EQUAL())
    println(calcEngine.getDisplayString())

}
fun singleDigitDivision(){
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.DIVIDE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.FIVE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.DIVIDE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.EQUAL())
    println(calcEngine.getDisplayString())

}
fun multiDigitDivision(){
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.SEVEN())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.DIVIDE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.DIVIDE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.THREE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.EQUAL())
    println(calcEngine.getDisplayString())

}
fun singleDigitPercentage(){
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.PERCENTAGE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.FIVE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.PERCENTAGE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.EQUAL())
    println(calcEngine.getDisplayString())

}
fun multiDigitPercentage(){
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.SEVEN())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.PERCENTAGE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.PERCENTAGE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.THREE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.EQUAL())
    println(calcEngine.getDisplayString())

}
fun multiOperation(){
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.SEVEN())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.PERCENTAGE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.DIVIDE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.THREE())
    println(calcEngine.getDisplayString())

    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.NINE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.INTO())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.DIVIDE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.THREE())
    println(calcEngine.getDisplayString())

    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.SEVEN())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.MINUS())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.DIVIDE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.ONE())
    calcEngine.pushKey(KEY.THREE())
    println(calcEngine.getDisplayString())
    calcEngine.pushKey(KEY.EQUAL())
    println(calcEngine.getDisplayString())




}
