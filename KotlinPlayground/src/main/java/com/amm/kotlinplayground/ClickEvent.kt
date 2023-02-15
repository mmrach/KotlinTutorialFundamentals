package com.amm.kotlinplayground

//v1 --------------- version sin código
interface ClickEvent1 {
    fun onClick(message:String)
}

//v2 --------------- versión con código
interface ClickEvent2 {
    fun onClick(message:String){
        println("<nombre>clicked: \"$message\"")
    }
}

//v2 --------------- versión con código y con estado a redeclarar en el implementador
interface ClickEvent3 {
    val nombre:String

    fun onClick(message:String){
        println("<$nombre>clicked: \"$message\"")
    }
}
