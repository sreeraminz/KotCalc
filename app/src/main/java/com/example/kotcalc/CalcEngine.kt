package com.example.kotcalc

class CalcEngine {
    private val calcRegex = Regex("[-]?[0-9]*\\.?[0-9]*")
    private var lastTextTmp: String = ""
    private var lastText: String = ""
    private val valueList: MutableList<Double> = ArrayList()
    private val operatorList: MutableList<KEY> = ArrayList()
    fun pushKey(key: KEY) {
        when (key) {
            is KEY.ONE -> {
                lastTextTmp += key.symbol
                if (validate(lastTextTmp)) lastText = lastTextTmp
            }
            is KEY.TWO -> {
                lastTextTmp += key.symbol
                if (validate(lastTextTmp)) lastText = lastTextTmp
            }
            is KEY.THREE -> {
                lastTextTmp += key.symbol
                if (validate(lastTextTmp)) lastText = lastTextTmp
            }
            is KEY.FOUR -> {
                lastTextTmp += key.symbol
                if (validate(lastTextTmp)) lastText = lastTextTmp
            }
            is KEY.FIVE -> {
                lastTextTmp += key.symbol
                if (validate(lastTextTmp)) lastText = lastTextTmp
            }
            is KEY.SIX -> {
                lastTextTmp += key.symbol
                if (validate(lastTextTmp)) lastText = lastTextTmp
            }
            is KEY.SEVEN -> {
                lastTextTmp += key.symbol
                if (validate(lastTextTmp)) lastText = lastTextTmp
            }
            is KEY.EIGHT -> {
                lastTextTmp += key.symbol
                if (validate(lastTextTmp)) lastText = lastTextTmp
            }
            is KEY.NINE -> {
                lastTextTmp += key.symbol
                if (validate(lastTextTmp)) lastText = lastTextTmp
            }
            is KEY.ZERO -> {
                lastTextTmp += key.symbol
                if (validate(lastTextTmp)) lastText = lastTextTmp
            }
            is KEY.DOT -> {
                lastTextTmp += key.symbol
                if (validate(lastTextTmp)) lastText = lastTextTmp
            }
            is KEY.PLUS -> {
                pushOperator(KEY.PLUS())
                pushValue(lastText.toDouble())
                lastText = ""; lastTextTmp = ""
            }
            is KEY.PLUS_MINUS -> {
                lastTextTmp += key.symbol
                if (validate(lastTextTmp)) lastText = lastTextTmp
            }
            is KEY.INTO -> {
                pushOperator(KEY.INTO())
                pushValue(lastText.toDouble())
                lastText = ""; lastTextTmp = ""

            }
            is KEY.DIVIDE -> {
                pushOperator(KEY.DIVIDE())
                pushValue(lastText.toDouble())
                lastText = ""; lastTextTmp = ""

            }
            is KEY.PERCENTAGE -> {
                pushOperator(KEY.PERCENTAGE())
                pushValue(lastText.toDouble())
                lastText = ""; lastTextTmp = ""

            }
            is KEY.CORRECTION -> {

                if (lastText != "") {
                    lastText = lastText.substring(0, lastText.lastIndex)
                } else {
                    popOperator()
                    lastText = getLastValueAsString()
                    popValue()
                }
            }
            is KEY.MINUS -> {
                pushOperator(KEY.MINUS())
                pushValue(lastText.toDouble())
                lastText = ""; lastTextTmp = ""

            }
            is KEY.EQUAL -> {
                pushValue(lastText.toDouble())
                startCalculation()
                lastText = ""; lastTextTmp = ""
            }
            is KEY.RESET -> {
                popAllvalues()
                popAllOperators()
                lastText = ""; lastTextTmp = ""

            }


        }
    }

    fun getDisplayString(): String {

        return run {
                        var displayString = ""
            for (index in 0..valueList.lastIndex) {
                displayString += run{
                    when{
                        ( valueList[index]-valueList[index].toInt())==0.0-> valueList[index].toInt().toString()
                          else-> valueList[index].toString()
                    }

                } + if (operatorList.isNotEmpty()) operatorList[index].symbol else ""
            }

            displayString+lastText
        }


    }


    private fun startCalculation() {
        // Finish primary level calculations include X / and % etc
        var index = operatorList.lastIndex
        while(operatorList.size>0&&index!=-1) {
            when (operatorList[0]) {
                is KEY.INTO -> {
                    valueList[0] = valueList[0] * valueList[1]
                    valueList.removeAt(1)
                    operatorList.removeAt(0)
                }
                is KEY.DIVIDE -> {
                    valueList[0] = valueList[0] / valueList[1]
                    valueList.removeAt(1)
                    operatorList.removeAt(0)
                }
                is KEY.PERCENTAGE -> {
                    valueList[0] = valueList[0] * valueList[1] / 100
                    valueList.removeAt(1)
                    operatorList.removeAt(0)
                }
                else->{
                    index--
                }

            }


        }
        // Finish secondary level calculations include + -  etc
        index = operatorList.lastIndex
        while(operatorList.size>0&&index!=-1) {
            when (operatorList[0]) {
                is KEY.PLUS -> {
                    valueList[0] = valueList[0] + valueList[1]
                    valueList.removeAt(1)
                    operatorList.removeAt(0)
                }
                is KEY.MINUS -> {
                    valueList[0] = valueList[0] - valueList[1]
                    valueList.removeAt(1)
                    operatorList.removeAt(0)
                }
                else->{
                    index--
                }

            }
        }

    }
    fun getResult():String{
        return if(valueList.isNotEmpty())valueList[valueList.lastIndex].toString() else ""
    }

    private fun popAllOperators() {
        valueList.clear()
    }

    private fun popAllvalues() {
        operatorList.clear()
    }

    private fun getLastValueAsString(): String {
        if (!valueList.isEmpty()) {
            return valueList.get(valueList.lastIndex).toString()
        }
        return ""
    }


    private fun popValue() {
        if (!valueList.isEmpty())
            valueList.removeAt(valueList.lastIndex)
    }

    private fun popOperator() {
        if (!operatorList.isEmpty())
            operatorList.removeAt(operatorList.lastIndex)
    }

    private fun pushValue(value: Double) {
        valueList.add(value)

    }

    private fun pushOperator(operator: KEY) {
        operatorList.add(operator)

    }

    private fun validate(text: String): Boolean {
        if (calcRegex.matchEntire(text) != null)
            return true
        return false

    }

}