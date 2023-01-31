package com.amm.kotlinplayground

fun main(){
    variables_01()
}

fun variables_01(){
    var name="Kotlin" //mutable
    val myName="Miguel" //inmutable
    //Error   myName="Pepe"
    print("Hello $name")
    print("Cambiame de línea $name")
    print("Hello $myName")
}