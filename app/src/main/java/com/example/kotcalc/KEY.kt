package com.example.kotcalc
//enum class KEY{
//    ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,ZERO,PLUS,MINUS,INTO,DIVIDE,PLUS_MINUS
//    ,EQUAL,CORRECTION,PERCENTAGE,DOT,RESET
//
//}

sealed class KEY{
    abstract val symbol:String
    class ONE(override val symbol:String = "1"):KEY()
    class TWO(override val symbol:String="2"):KEY()
    class THREE(override val symbol:String="3"):KEY()
    class FOUR(override val symbol:String="4"):KEY()
    class FIVE(override val symbol:String="5"):KEY()
    class SIX(override val symbol:String="6"):KEY()
    class SEVEN(override val symbol:String="7"):KEY()
    class EIGHT(override val symbol:String="8"):KEY()
    class NINE(override val symbol:String="9"):KEY()
    class ZERO(override val symbol:String="0"):KEY()
    class PLUS(override val symbol:String="+"):KEY()
    class MINUS(override val symbol:String="-"):KEY()
    class INTO(override val symbol:String="X"):KEY()
    class DIVIDE(override val symbol:String="/"):KEY()
    class PLUS_MINUS(override val symbol:String = "-"):KEY()
    class EQUAL(override val symbol: String="") :KEY()
    class CORRECTION(override val symbol: String="") :KEY()
    class PERCENTAGE(override val symbol:String="%"):KEY()
    class DOT(override val symbol:String="."):KEY()
    class RESET(override val symbol: String="") :KEY()
}