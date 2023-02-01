package com.amm.kotlinplayground

import java.util.*

fun main(){
    //Variables()
    Operators()
}

fun Variables(){
//    // Kotlin var an val keywords
//    //---------------------------------------------------
//    var name="Kotlin" //mutable
//    val myName="Miguel" //inmutable
//    //Error   myName="Pepe"
//    print("Hello $name")
//    print("Cambiame de línea $name")
//    print("Hello $myName")
//
////    return

    //Initializing variables
    //---------------------------------------------------
//    val nombre
//    nombre = "Miguel"
//
//    val miNombre:String
//    miNombre = "Miguel"
//
//    val miNombre2:String = "Onofre"
//
//    println("Hola $miNombre $miNombre2")

//    //Intro to variable types Int and String
//    //Basic Types in Kotlin
//    //---------------------------------------------------
//    val miNombre = "Miguel"
//    val age: Int
//    age= 21
//    println("Hola mi nombre es $miNombre y tengo $age años")
//
//    //-------------------
//    TiposNumericosBasicos()
//
//    val myByte: Byte
//    myByte = -120 // -120   127   128 (error) -129 (error)
//
//    val myShort: Short
//    myShort = 32345
//
////    println($myshort) // Error no está entre comillas.
//    println(myShort)
//
//    //Long Values  'L'
//    println("\n----------------------------------")
//    println("Long")
//    val myLong = 1L
//    val myInt = 1
//    println(myLong)
//    println(myInt)
//
//    //Floating Type Numbers
//    println("\n----------------------------------")
//    println("Floating type numbers")
//    val piInt = 3.14159265359  //por defecto los números con decimales son  Double
//    val myPif = 3.14159265359f //Warning de precisión
//    println(piInt)
//    println(myPif)  //Salen menos decimales en consola. La precisión no es válida. Se redondea.
//    //val myPif = 3.141592f //Ahora con f  o  F  es un Float
//
//    //-------------------------
//    println("\n----------------------------------")
//    println("Tipos Básicos")
//    TiposTextoBasicos()
//    TipoBoolean()
//
//    //Arrays
//    println("\n----------------------------------")
//    println("Arrays")
//    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
//    println("Value at 3rd position : " + numbers[2])

    DataTypeConversion()

}

fun TiposNumericosBasicos(){
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    println("Int Value is " + a)
    println("Double  Value is " + d)
    println("Float Value is " + f)
    println("Long Value is " + l )
    println("Short Value is " + s)
    println("Byte Value is " + b)
}

fun TiposTextoBasicos(){
    val letter: Char    // defining a Char variable
    letter = 'A'        // Assigning a value to it
    println("$letter")

    //Caracterers Especiales
    println("Caracteres especiales")
    println("........................")
    print('\n') //prints a newline character
    println("........................")//Si usamos println serían dos saltos
    println('\$') //prints a dollar $ character
    println('\\') //prints a back slash \ character

    //Escaped Strings y Raw Strings
    val escapedString : String  = "I am escaped String!\n"
    var rawString :String  = """This is going to be a
multi-line string and will 
not have any escape sequence""";

    print(escapedString)
    println(rawString)

    //Concatenación de Strings
    val start = "Talk is cheap. "
    val middle = "Show me the code. "
    val end = "- Linus Torvalds"

    val result = start + middle + end
    println(result)

}

fun TipoBoolean(){
    val A: Boolean = true   // defining a variable with true value
    val B: Boolean = false   // defining a variable with false value

    println("Value of variable A "+ A )
    println("Value of variable B "+ B )

    //Nullable Boolean   (cualquier tipo en realidad con ? detrás)
    val boolNull: Boolean? = null
}

fun DataTypeConversion(){
    val x: Int = 100
    //val y: Long = x  // Not valid assignment
    val y: Long = x.toLong()

    println("\n----------------------------------")
    println("Data Type Conversion")
    println(y)
}

fun Operators(){
    println("\n----------------------------------")
    println("Operators")

    val a=23
    val b=12
    print(a/b)  //Devuelve un valor entero. División entera.

    val c=23.0
    val d=12
    println(c/d)  //Devuelve un valor double. División float con que al menos uno sea double o float.

    //Módulo
    val cociente=20
    val divisor=2

    val resto = cociente % divisor
    println(" $cociente % $divisor = $resto" )

    //Unary Oparators
    println("\n----------------------------------")
    println("Unary Operators")

    val aa = 1
    val bb = true
    var cc = 1

    var result: Int
    var booleanResult: Boolean

    result = -aa
    println("aa=$aa")
    println("-aa = $result")

    println("bb=$bb")
    booleanResult = !bb
    println("!bb = $booleanResult")

    println("cc=$cc")
    --cc
    println("--cc = $cc")


    //Comparison and Equality Operators
    println("\n----------------------------------")
    println("Comparison and Equality Operators")
    var v = -12
    var w = 12

    // use of greater than operator
    // Use of if  else statement
    val max = if (v > w) {
        println("v is larger than w.")
        v
    } else {
        println("v is larger than w.")
        w
    }

    println("max = $max")


    //Logical Operators
    println("\n----------------------------------")
    println("Logical Operators")
    v  = 10
    w = 9
    var x = -1
    val logicalResult: Boolean

    // result is true is a is largest
    logicalResult = (v>w) && (v>x) // result = (v>w) and (v>x)
    println(logicalResult)

    //in Operator
    println("\n----------------------------------")
    println("in Operatorin Operator")
    var numbers = intArrayOf(1, 4, 42, -3)
    println(Arrays.toString(numbers)) //Al poner esta sentencia nos invita a inportar la librería Arrays

    if (4 in numbers) {
        println("numbers array contains 4.")
    }


    //Index Access Operator
    println("\n----------------------------------")
    println("Index Access Operator")
    numbers  = intArrayOf(1, 2, 3, 4, - 1)
    println("numbers= " + Arrays.toString(numbers)) //Al poner esta sentencia nos invita a inportar la librería Arrays
    numbers[1]= 12
    println("numbers[1]=12")
    println("numbers= " + Arrays.toString(numbers)) //Al poner esta sentencia nos invita a inportar la librería Arrays
}