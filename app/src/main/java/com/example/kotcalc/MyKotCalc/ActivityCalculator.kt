package com.example.kotcalc.myKotCalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.example.kotcalc.R
import kotlinx.android.synthetic.main.activity_calculator.*

class ActivityCalculator : AppCompatActivity() {

    private var displayList = ArrayList<String>()
    var calVal = ""
    var value = 0
    private val calcRegex = Regex("^([-+/*]\\d+(\\.\\d+)?)*")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        one.setOnClickListener {
            displayList.add("1")
            screenDisplay(displayList, display)
        }
        two.setOnClickListener {
            displayList.add("2")
            screenDisplay(displayList, display)
        }
        three.setOnClickListener {
            displayList.add("3")
            screenDisplay(displayList, display)
        }
        plus.setOnClickListener {
            displayList.add("+")
            screenDisplay(displayList, display)
        }
        btn_c.setOnClickListener {
            if (displayList.isEmpty()) {
                displayList.clear()
                Toast.makeText(this, "Please enter some value", Toast.LENGTH_SHORT).show()
                clrAll(display)
            } else {
                clrDisplay(displayList, display)
            }
        }
        equal.setOnClickListener { calculate(displayList) }
    }

    private fun calculate(displayList: ArrayList<String>) {
       for (i in 0 until displayList.size){
           if (displayList[i] == "+"){
               //value += calVal.toInt()
               Log.d("TEST123","=yesValue=$value")
           }
           else{
               calVal += displayList[i]
               Log.d("TEST123","=noCalVal=$calVal")
           }
       }
        Log.d("TEST123","total$value")
    }

    private fun screenDisplay(
        displayList: ArrayList<String>,
        display: TextView
    ) {
        var displayElement = ""
        for (i in 0 until displayList.size) {
            displayElement += displayList[i]
        }
        display.text = displayElement
        Log.d("TEST123", "=b=$displayElement")
    }

    private fun clrDisplay(
        displayList: ArrayList<String>,
        display: TextView
    ) {
        var displayElement = ""
        for (i in 0 until displayList.size) {
            displayElement += displayList[i]
        }
        displayList.removeAt(displayList.size - 1)
        display.text = displayElement
    }

    private fun clrAll(display: TextView) {
        display.text = ""
    }
}