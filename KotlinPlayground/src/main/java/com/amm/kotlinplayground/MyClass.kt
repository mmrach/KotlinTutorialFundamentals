package com.amm.kotlinplayground

import java.util.*

fun main(){
    //Variables()
    //Operators()
    //IfAndWhen()
    //Loops()
    Functions()
}

fun Variables(){
    // Kotlin var an val keywords
    //---------------------------------------------------
    var name="Kotlin" //mutable
    val myName="Miguel" //inmutable
    //Error   myName="Pepe"
    print("Hello $name")
    print("Cambiame de línea $name")
    print("Hello $myName")

//    return

    //    Initializing variables
    //    ---------------------------------------------------
    //val nombre
    //nombre = "Miguel"

    val yo:String
    yo = "Miguel"

    val miNombre:String = "Onofre"

    println("Hola $miNombre $miNombre")

    //Intro to variable types Int and String
    //Basic Types in Kotlin
    //---------------------------------------------------
    val miNombre2 = "Miguel"
    val age: Int
    age= 21
    println("Hola mi nombre es $miNombre2 y tengo $age años")

    //-------------------
    TiposNumericosBasicos()

    val myByte: Byte
    myByte = -120 // -120   127   128 (error) -129 (error)

    val myShort: Short
    myShort = 32345

//    println($myshort) // Error no está entre comillas.
    println(myShort)

    //Long Values  'L'
    println("\n----------------------------------")
    println("Long")
    val myLong = 1L
    val myInt = 1
    println(myLong)
    println(myInt)

    //Floating Type Numbers
    println("\n----------------------------------")
    println("Floating type numbers")
    val piInt = 3.14159265359  //por defecto los números con decimales son  Double
    val myPif = 3.14159265359f //Warning de precisión
    println(piInt)
    println(myPif)  //Salen menos decimales en consola. La precisión no es válida. Se redondea.
    //val myPif = 3.141592f //Ahora con f  o  F  es un Float

    //-------------------------
    println("\n----------------------------------")
    println("Tipos Básicos")
    TiposTextoBasicos()
    TipoBoolean()

    //Arrays
    println("\n----------------------------------")
    println("Arrays")
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println("Value at 3rd position : " + numbers[2])

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

fun IfAndWhen(){
    println("\n----------------------------------")
    println("Loops and Branching")
    println("----------------------------------")

    //If expression
    println("\n----------------------------------")
    println("If expression")
    var a=10
    var b=8
    var x: Int
    var max: Int

    max = a
    if (a < b) max = b

    // With else
    if (a > b) {
        max = a
    } else {
        max = b
    }

    // As expression
    max = if (a > b) a else b
    println(max)

    //If Else Chain
    println("\n----------------------------------")
    println("If Else Chain")
    var age = 17
    if(age < 12) {
        println("Child")
    } else if (age in 12..17) {
        println("Teen")
    } else if (age in 18..21) {
        println("Young Adult")
    } else if (age in 22..30) {
        println("Adult")
    } else if (age in 30..50) {
        println("Middle Aged")
    } else {
        println("Old")
    }

    //When expression
    println("\n----------------------------------")
    println("When expression")
    x=1
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x is neither 1 nor 2")
        }
    }

    println("\n----------------------------------")
    println("When expression")
    var dayOfWeek = 4
    when(dayOfWeek) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid Day")
    }

    //Multiple statements per block
    println("\n----------------------------------")
    println("Multiple statements per block")
    when(dayOfWeek) {
        1 -> {
            // Block
            println("Monday")
            println("First day of the week")
        }
        7 -> println("Sunday")
        else -> println("Other days")
    }

    //Using When as expression
    println("\n----------------------------------")
    println("Using When as expression")
    var dayOfWeekInString = when(dayOfWeek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day"
    }

    println("Today is $dayOfWeekInString")	// Today is Thursday

    //Combining multiple when branches into one using comma
    println("\n----------------------------------")
    println("Combining multiple when branches into one using comma")
    dayOfWeek = 6
    when(dayOfWeek) {
        1, 2, 3, 4, 5 -> println("Weekday")
        6, 7 -> println("Weekend")
        else -> println("Invalid Day")
    }

    //Checking whether a given value is in a range or not using in operator
    println("\n----------------------------------")
    println("Checking whether a given value is in a range or not using in operator")
    var dayOfMonth = 6
    when(dayOfMonth) {
        in 1..7 -> println("We're in the first Week of the Month")
        !in 15..21 -> println("We're not in the third week of the Month")
        else -> println("none of the above")
    }

    //Checking whether a given variable is of certain type or not using is operator
    println("\n----------------------------------")
    println("Checking whether a given variable is of certain type or not using is operator")
    var y : Any = 6.86  //Any define x que puede ser de cualquier tipo.
    when(y) {
        is Int -> println("$y is an Int")
        is String -> println("$y is a String")
        !is Double -> println("$y is not Double")
        else -> println("none of the above")
    }

    //Using when as a replacement for an if-else-if chain
    println("\n----------------------------------")
    println("Using when as a replacement for an if-else-if chain")
    var number = 20
    when {
        number < 0 -> println("$number is less than zero")
        number % 2 == 0 -> println("$number is even")
        number > 100 -> println("$number is greater than 100")
        else -> println("None of the above")
    }

}

fun Loops(){
    println("\n----------------------------------")
    println("Loops")
    println("----------------------------------")

    //While loop
    println("\n----------------------------------")
    println("While loop")
    var x = 1
    while(x <= 5) {
        println("$x ")
        x++
    }

    //do while loop
    println("\n----------------------------------")
    println("do while loop")
    x = 1
    do {
        print("$x ")
        x++
    } while(x <= 5)

    //do while loop: at least once execution
    println("\n----------------------------------")
    println("do while loop: at least once execution")
    x = 6
    do {
        print("$x ")
        x++
    } while(x <= 5)

    //Foor Loop: Iterating through a range
    println("\n----------------------------------")
    println("Foor Loop: Iterating through a range")
    for(value in 1..10) {
        print("$value ")
    }

    //Foor Loop: Iterating through an array
    println("\n----------------------------------")
    println("Foor Loop: Iterating through an array")
    for(value in 1..10) {
        print("$value ")
    }

    //Foor Loop: Iterating through an array using its indices
    println("\n----------------------------------")
    println("Foor Loop: Iterating through an array using its indices")
    var primeNumbers = intArrayOf(2, 3, 5, 7, 11)
    println(Arrays.toString(primeNumbers))

    for(index in primeNumbers.indices) {
        println("PrimeNumber(${index+1}): ${primeNumbers[index]}")
    }

    //Foor Loop: Iterating through an array using withIndex()
    println("\n----------------------------------")
    println("Foor Loop: Iterating through an array using withIndex()")
    for((index, number) in primeNumbers.withIndex()) {
        println("PrimeNumber(${index+1}): $number")
    }

    //Break and Continue
    println("\n----------------------------------")
    println("Break and Continue")
    for (num in 1..100) {
        if (num % 3 == 0 && num % 5 == 0) {
            println("First positive no divisible by both 3 and 5: ${num}")
            break
        }
    }

    //Skip to the next iteration of a loop using the continue keyword
    for (num in 1..10) {
        if (num%2 == 0) {
            continue;
        }
        print("${num} ")
    }



}

//Functions------------------------------------
fun Functions(){
    println("\n----------------------------------")
    println("MultiplesOf")

    MultiplesOf(1,100,2) //Llamamos sin poner el nombre del parámetro
    MultiplesOf(first=6, last = 60, multipleOf = 3) //LLamamos poniendo el nombre del parametro
    //LLamamos a la que tiene parametros por defecto

    println("\n----------------------------------")
    println("Multiples")
    Multiples(5,10,2)
    Multiples(last=60)  //Podemos obviar los que tienen valor por defecto.
    Multiples(last=10, multipleOf=3, first=4)  //Si ponemos los nombres podemos cambiar el orden
    Multiples(first=100, multipleOf=2, last=50)  //Que pasa aqui?

    println("\n----------------------------------")
    println("CalculateCatAge")
    var catAge = CalculateCatAge(7)
    println("Cat age is $catAge")

    println("\n----------------------------------")
    println("CalcCatAge")
    //Usamos la de sintaxis corta
    println("Cat age is " + CalcCatAge(8))  //Concatenamos la llamada a la funcion


    println("\n----------------------------------")
    println("OverTrheshold")
    var value=0
    while (!overThreshold(value)){
        println("$value -> under or at threshold")
        value++
    }
    println("With $value we are over threshold")

}

//Multiplos de un número entre dos numeros
fun MultiplesOf(first:Int, last:Int, multipleOf:Int){
    println("----------------------------------")
    println("first=$first, last=$last number=$multipleOf")
    for (i in first..last){
        if (i%multipleOf==0){
            println("$i is multiple of $multipleOf")
        }
    }
}

fun Multiples(first:Int=1, last:Int, multipleOf:Int=2){ //Parametros por defecto
    println("----------------------------------")
    println("first=$first, last=$last number=$multipleOf")
    for (i in first..last){
        if (i%multipleOf==0){
            println("$i is multiple of $multipleOf")
        }
    }
}

fun CalculateCatAge(age:Int): Int {  // en tiempo humano son 7 años por cada año del gato Retorna : Int
    val catAge = age * 7
    //println("This cat is $catAge years old")
    return catAge
}

fun CalcCatAge(age:Int):Int = age * 7  //Definimos la función con sintaxis corta

//Retorno Booleano
fun overThreshold(value:Int):Boolean{
    return value>14
}