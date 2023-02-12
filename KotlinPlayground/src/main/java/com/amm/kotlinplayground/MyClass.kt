package com.amm.kotlinplayground

import java.util.*


fun main(){
    //variables()
    //operators()
    //ifAndWhen()
    //loops()
    //functions()
    //lambdas()
    //destructuring()
    //collections()
    clases()
}

//------- FUNCTIONS------------------
fun variables(){
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
    tiposNumericosBasicos()

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
    tiposTextoBasicos()
    tipoBoolean()

    //Arrays
    println("\n----------------------------------")
    println("Arrays")
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println("Value at 3rd position : " + numbers[2])

    dataTypeConversion()

}

fun tiposNumericosBasicos(){
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

fun tiposTextoBasicos(){
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

fun tipoBoolean(){
    val A: Boolean = true   // defining a variable with true value
    val B: Boolean = false   // defining a variable with false value

    println("Value of variable A "+ A )
    println("Value of variable B "+ B )

    //Nullable Boolean   (cualquier tipo en realidad con ? detrás)
    val boolNull: Boolean? = null
}

fun dataTypeConversion(){
    val x: Int = 100
    //val y: Long = x  // Not valid assignment
    val y: Long = x.toLong()

    println("\n----------------------------------")
    println("Data Type Conversion")
    println(y)
}

fun operators(){
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

    multiplesOf(1,100,2) //Llamamos sin poner el nombre del parámetro
    multiplesOf(first=6, last = 60, multipleOf = 3) //LLamamos poniendo el nombre del parametro
    //LLamamos a la que tiene parametros por defecto

    println("\n----------------------------------")
    println("Multiples")
    multiples(5,10,2)
    multiples(last=60)  //Podemos obviar los que tienen valor por defecto.
    multiples(last=10, multipleOf=3, first=4)  //Si ponemos los nombres podemos cambiar el orden
    multiples(first=100, multipleOf=2, last=50)  //Que pasa aqui?

    println("\n----------------------------------")
    println("CalculateCatAge")
    var catAge = calculateCatAge(7)
    println("Cat age is $catAge")

    println("\n----------------------------------")
    println("CalcCatAge")
    //Usamos la de sintaxis corta
    println("Cat age is " + calcCatAge(8))  //Concatenamos la llamada a la funcion


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
fun multiplesOf(first:Int, last:Int, multipleOf:Int){
    println("----------------------------------")
    println("first=$first, last=$last number=$multipleOf")
    for (i in first..last){
        if (i%multipleOf==0){
            println("$i is multiple of $multipleOf")
        }
    }
}

fun multiples(first:Int=1, last:Int, multipleOf:Int=2){ //Parametros por defecto
    println("----------------------------------")
    println("first=$first, last=$last number=$multipleOf")
    for (i in first..last){
        if (i%multipleOf==0){
            println("$i is multiple of $multipleOf")
        }
    }
}

fun calculateCatAge(age:Int): Int {  // en tiempo humano son 7 años por cada año del gato Retorna : Int
    val catAge = age * 7
    //println("This cat is $catAge years old")
    return catAge
}

fun calcCatAge(age:Int):Int = age * 7  //Definimos la función con sintaxis corta

//Retorno Booleano
fun overThreshold(value:Int):Boolean{
    return value>14
}

//Lambdas ---------------------------------------------
fun lambdas(){
    println("\n----------------------------------")
    println("Hello Lambdas")
    val lambda1 = { println("Hello Lambdas") }
    println(lambda1)

    println("\n----------------------------------")
    println("Función suma normal")
    sumaNormal(2,5)

    println("\n----------------------------------")
    println("Función suma con Lambda")
    //Creamos la Lambda, pero la asignamos a una variable, esa variable es una función ahora.
    val sumaLambda: (Int, Int) -> Int = { a, b -> a+b}
    //La usamos.
    println(sumaLambda(3,4))

    println("\n----------------------------------")
    println("CatAge con Lambda")
    //Transformar la función CalulateCatAge como una Lambda
    val catAge: (Int) -> Int = {age -> age*7}
    println(catAge(7))

    println("\n----------------------------------")
    println("Using it as parameter")
    //Como tenemos un único parámetro podemos sustituir su uso por it
    val theCatAge: (Int) -> Int = {
        it *7
    }
    println(theCatAge(8))

    println("\n----------------------------------")
    println("Lambdas functions that returns Unit")
    //La función siguiente no devuelve nada
    fun showName(name:String){
        println(name)
    }
    //Si la convertimos en una expresión lambda tendremos que poner Unit como tipo de retorno
    val theName: (String) -> Unit = {println("Hola, mi nombre es $it")}
    println(theName("Miguel"))

    val lambda2 : (String) -> Unit = { name: String ->
        println("My name is $name")
    }
    println(lambda2("Miguel"))

    println("\n----------------------------------")
    println("Lambdas as functions arguments")

    //La funcción   processLanguages esta definida fuera (abajo), echarle un vistazo.
    //Es una función que recibe un lambda en su parametro action:
    //Ese lambda recibe un parametro String y devuelve Unit

    //Creamos una lista de lenguajes de programación
    val languages = listOf("Kotlin", "Java", "Swift", "Dart", "Rust")
    //Creamos un lambda para pasarselo como parametro a la función processLanguages
    val action = { language: String -> println("Hello $language") }
    //LLamamos a processLanguaes con el action definido
    processLanguages(languages, action)
    //Creamos otro lambda y otra forma de construirla
    val action2: (String) -> Unit = {  print("[$it]")}
    //Y volvemos a llamar a la función
    processLanguages(languages, action2)

    //Pero podemos pasar la definición de la lambda justo cuando llamamos a la función
    //sin necesidad de almacenarla en una variable
    println("\n... pasando la definción en la llamada")
    processLanguages(languages, {language:String -> print("[ $language ]") } )

    //Pero esta forma de llamara a la función es un poco enrevesada de leer
    //En este caso el cuerpo de la lambda es corto y puede verse, pero si es mas largo se complica la lectura del código.
    //Por eso Kotlin ha definido la sintaxis especial Trailing Lambda que se puede aplicar
    //cuando la lambda es el último parámetro en la llamada a una función.
    //Usando la sintaxis Trailing Lambda, la lambda se puede poner fuera de la llamada a la función.
    println()
    processLanguages(languages) { language ->
        println("--> $language")
    }
    //Vemos como parece que processLanguages tenga sólo un parámetro, pero realmente tiene 2,
    //el segundo y último es un lambda que sacamos fuera de los paréntesis, ponemos sus parametros
    //y el body en lineas separadas.

    println("\n----------------------------------")
    println("Otro trailing lambda")
    //La función enhancedMessage está definida abajo y tiene una función como último parámetro.
    //esa función devuelve un entero.
    //La llamamos aquí con la sintaxis del trailing lambda
    enhancedMessage("Esto es un mensaje"){
        //Un simple 12 que es la última instrucción del lambda, por lo que el retorno es 12
        12
    }
    enhancedMessage("Esto es otro mensaje"){
        //ahora pasamos la función suma que recibe dos enteros y que devuelve un Int.
        sumaLambda(3,4)
    }



    println("\n----------------------------------")
    println("Más lambdas as functions arguments")
    languages.forEach { println(it) }
    // Aplicamos funciones encadenadas al array de lambdas.
    // Es decir, primero seleccionamos los que empiezan por K, luego lo pasamos a minúsculas y todos ellos los imprimimos
    languages
        .filter { it.startsWith("K")}
        //La siguiente llamada tiene tela, la función replaceFirstChar (que suplanta a .capitalize())
            // también tiene un trailing lambda, su it recibe la primera letra y a esta le aplica un lowercase
        .map { it.replaceFirstChar { it.lowercase()} }
        .forEach { println(it) }

    //Lo mismo se vería de esta forma si no existiese la sintaxis trailing lambda
    println("\nSin la sintaxis trailing lambda")
    languages.forEach({ println(it) })
    languages
        .filter({ it.startsWith("K")})
        .map({ it.capitalize() }) //Fijaros que aquí capitalize lo marca como deprecated y nos aconseja el uso de replaceFirstChar
        .forEach({ println(it) })


    //EJERCICIO: ***********************************************************
    //Hacer hacer lo mismo pero para todos los lenguajes que tienen una 'a' en su nombre
    println("\nLenguajes que contienen una a")
    //**********************************************************************

    println("\n----------------------------------")
    println("Todavía más lambdas as functions arguments")
    // create a filtered list of even values
    // Se llama a la función filter de una lista.
    // la función filter es llamada para cada elmento de la lista
    // Si nos fijamos en el prototipo de la función filter (poner el ratón encima)
    // vemos que recibe un parametro llamado predicate: que es una función lambda
    // que recibe un parametro de tipo T (el de los elementos de la lista) y devuelve un Booleano
    // filter devuelve una lista con los elemntos que cumplen el booleano calculado en la lambda
    val vals = listOf(1, 2, 3, 4, 5, 6).filter( predicate =  { num ->
        num.mod(2) == 0
    })
    println(vals)

    println("\n----------------------------------")
    println("Omitimos el nombre del parametro si es el único")

    val vals2 = listOf(1, 2, 3, 4, 5, 6).filter( { num ->
        num.mod(2) == 0
    })
    println(vals2)

    //Nos alerta el editor que podemos sacar el lambda fuera del paréntesis
    //Esto es la sintaxis Trailing Lambda

    //Quitamos por tanto incluso los paréntesis que se usan para pasar los parametros a las funciones.
    val vals3 = listOf(1, 2, 3, 4, 5, 6).filter  { num ->
        num.mod(2) == 0
    }
    print(vals3)

    println("\n----------------------------------")
    println("Repasando  ... ")
    println("Simple Lambdas")
    // Una lambda sin parámetros que no devuelve nada se asigna a una variable.
    // La ultima expresion del cuerpo del lambda es lo que se devuelve.
    // Como println no devuelve nada por eso nuestra lambda devuelve Unit
    val simpleLambda : () -> Unit = { println("Hello") }

    //Para llamarla como una función hay que ponerle los paréntesis.
    print(simpleLambda())

    // Como simpleLamba no tiene parámetros y el valor de retorno se puede inferir del cuerpo del lambda
    // se puede simplificar más
    val simpleLambda2 = {println("Hola simpleLambda2")}
    // vemos que hemos quitado los dos puntos y pasamos directamente al igual, sino nos pide el tipo
    println(simpleLambda2)


    println("\n----------------------------------")
    println("Formas de simplificar un lambda")
    val lambdaOriginal : (String, String) -> String = { first: String, last: String ->
        "My name is $first $last"
    }

    //Primera simplificación. Omitimos la declaración de tipos pero definimos el tipo de cada parametro
    val lambdaSimplificado1 = { first: String, last: String ->
        "My name is $first $last"
    }

    val lambdaSimplificado2 : (String, String) -> String = { first, last ->
        "My name is $first $last"
    }

    println(lambdaOriginal("Miguel", "Martínez"))
    println(lambdaSimplificado1("Miguel", "Martínez"))
    println(lambdaSimplificado2("Miguel", "Martínez"))

    println("\n----------------------------------")
    println("Invocando un Lambda")
    val saludo = { greeting: String, name: String ->
        println("$greeting $name")
    }

    saludo("Hello", "Kotlin")
    saludo.invoke("Hello", "Kotlin")

    println("\n----------------------------------")
    println("Devolviendo (multiples) valores desde un lambda")
    println("Qualified Returns")
    //In a normal function, if we wanted to return early, we could add a return that would return out
    //of the function before it ran to completion.
    //However, with lambda expressions, adding a return in this way results in a compiler error.
    // - Quitar los comentarios para ver que el compilador me pone un error.
//    val lambdaError = { greeting: String, name: String ->
//        if(greeting.length < 3) return // error: return not allowed here
//
//        println("$greeting $name")
//    }

    //To accomplish the desired result, we must use what is referred to as a qualified return.
    val lambdaQualified: (String, String) -> Unit = greet@{ greeting: String, name: String ->
        if(greeting.length < 3) return@greet

        println("$greeting $name")
    }
    //To accomplish the desired result, we must use what is referred to as a qualified return.
    val lambdaQualifiedSimplified = greet@{ greeting: String, name: String ->
        if(greeting.length < 3) return@greet

        println("$greeting $name")
    }
    //Hemos etiquetado nuestro lambda con la etiqueta greet@
    //Cuando queremos terminar podemos usar return@greet  (return at greet)
    //En este caso nuestro return anticipado no devuelve nada.
    lambdaQualified("Hello","Kotlin")
    println("La siguiente no devuelve nada porque Hi tiene menos de 3 letras.")
    lambdaQualifiedSimplified("Hi","Kotlin")

    // Las lambdas anteriornes no devuelven nada, que pasa si queremos devolver un string?
    // La siguiente lambda devuelve un String, el caso base devuelvele la concatenación
    // La devolución por etiqueta devuelve cadena vacía
    val theLambdaString = greet@{ greeting: String, name: String ->
        if(greeting.length < 3) return@greet ""

        "$greeting $name"
    }
    println("Ahora la lambda devuelve un string")
    println(theLambdaString("Hi","Miguel"))
    //Cómo hacemos para concatenar el retorno de la función lamda?
    //Suponer que quiero poner el string devuelto entre corchetes [String]
    //Esta sentencia da error., descomentarlopara verlo
    // println("[$theLambdaString("Hi","Miguel")]")
    // Hay que usar las llaves para delmitar la función lambda en la interpolación de la variable.
    println("Ahora la lambda devuelve un string que interpolamos dentro de corchetes")
    println("[${theLambdaString("Hi","Miguel")}]")
    println("... pero como devuelve la cadena vacía lo probamos con otro parámetro greeting")
    println("[${theLambdaString("Hola","Miguel")}]")

    //Extendemos la devolución a más de un caso no default
    println("Ejemplo de multiples ")
    val lambdaMultipleString = greet@ { greeting: String, name: String ->
        if(greeting.length < 3) return@greet ""
        if(greeting.length < 6) return@greet "Welcome !"

        "$greeting $name !"
    }
    println("Return vacio : " + lambdaMultipleString("Hi","Miguel"))
    println("Return Welcome:" +lambdaMultipleString("Hola","Miguel"))
    println("Return Default:" + lambdaMultipleString("Welcome","Miguel"))

    println("\n----------------------------------")
    println("Accediendo al Lambda Clousure")
    // Lambdas can access data and functions from outside their scope.
    // This information from the outer scope is the lambda’s closure.
    // The lambda can call functions, update variables, and use this information however it needs.
    var currentStudentName: String? = null

    val lambdaClousure = {
        val nameToPrint = currentStudentName ?: "Our Favorite Student"
        println("Welcome $nameToPrint")
    }
    lambdaClousure() // output: Welcome Our Favorite Student
    currentStudentName = "Onofre"
    lambdaClousure() // output: Welcome Nate
}

fun sumaNormal(x:Int, y:Int):Int{
    return x+y
}

fun processLanguages(languages: List<String>, action: (String) -> Unit) {
    //Recibe una lista de Strings (supuestos lenguajes de programación)
    // y una función como lambda. Ese lambda recibe un string y devuelve nada (Unit)
    //Sobre la lista de Strings llamamos a forEach pasándoles el parametro action,
    //es decir el lambda que recbimos como parámetro.
    //Entonces forEach pasará a este action los elementos de la lista de uno en uno, y el lambda hará su trabajo.
    //Que cada vez que llamen a processLanguages puede ser una acción diferente, un lambda diferente.
    languages.forEach(action)
}

fun enhancedMessage(message:String, funAsParameter: ()-> Int){
    println(message)
    println("y el resultado de la función es:")
    println(funAsParameter())
}

//Destructuring ---------------------------------------------
fun destructuring(){
    println("\n----------------------------------")
    println("Destructuring in Kotlin")

    //Creamos una nueva Data Class, ver documentación de las DataClass. de momento la creamos.
    data class Person(val id:Int, val name: String = "", val age: Int = 0)

    val person1 = Person( 1, "Jon Snow", 20)
    val (id, name, age) = person1
    println(id)     //1
    println(name)   //Jon Snow
    println(age)    //20

    //Internamente un objeto que puede desestructurarse tiene la función componentN() desde 1 hasta el que haga falta
    val person2 = Person( 2, "Miguel", 32)
    val id2 = person2.component1();
    val name2 = person2.component2();
    val age2 = person2.component3();

    println("\n----------------------------------")
    println("Destructuring as return values")
    //Así se puede definir una función que devuelve un objeto Person
    fun getPersonInfo(): Person { return Person(3, "Ned Stark", 45) }
    //Pero también se puede definir así:
    fun getOtherPersonInfo() = Person(3, "Ned Stark", 45)
    //Desestructuramos el valor de retorno de la función.
    val(id3, name3, age3) = getPersonInfo()
    val(id4, name4, age4) = getOtherPersonInfo()
    println("$id3, $name3, $age3")

    println("\n----------------------------------")
    println("Una función que devuelve un Pair (dos valores)")
    fun twoValuesReturn(): Pair<Int, String> {
        // ...
        return Pair(1, "success")
    }
    //Desestructuramos el valor de retorno de la función.
    val (result, status) = twoValuesReturn()
    println("Result=$result Status=$status")

    println("\n----------------------------------")
    println("Usando to para crear el pair")
    val lambdaPair: (Pair<String, Int>) -> Unit = { pair ->
        println("key:${pair.first} - value:${pair.second}")
    }
    lambdaPair("id-123" to 5)

    //Desestructuramos los parametros recibidos en los propios parametros del lambda
    val lambdaPair2: (Pair<String, Int>) -> Unit = { (key, value) ->
        println("key:$key - value:$value")
    }
    lambdaPair2("id-345" to 445)

    println("\n----------------------------------")
    println("Pasamos del id")
    val (_, namep, agep) = person2
    println("$namep, $agep")


    println("\n----------------------------------")
    println("Collections and For-Loops")
    //El esquema de desestructuración de los elementos de una colección es:
    //for ((a, b) in collection) { ... }
    var map: HashMap<Int, Person> = HashMap()

    map.put(1, person1)
    map.put(2, person2)
    map.put(3, Person(3,"Onofre", 32))

    //En este mapa (clave/valor) la clave es el entero que hemos puesto, y el valor es un objeto persona
    //Fijaros como se Interpola el objeto en el println.
    for((key, value) in map){
        println("Key: $key, Value: $value")
    }

}

//Collections ---------------------------------------------
fun collections(){
    println("\n----------------------------------")
    println("Collections in Kotlin. Overview")
    println("----------------------------------")

    // An example for immutable list
    println("\n----------------------------------")
    println("Inmutable listOf")
    val immutableList = listOf("Pedro","Juan","Antonio")
    // gives compile time error. No existe el método add
    //immutableList.add = "Jesús"
    for(item in immutableList){
        println(item)
    }

    println("\n----------------------------------")
    println("Inmutable set")
    // Estamos inicializando con valores repetidos,
    // el compilador nos deja, pero realmente no se añaden los repetidos
    // ver la salida.
    var immutableSet = setOf(6,9,9,0,0,"Miguel","Pedro","Pedro")
    // gives compile time error. add no está definido.
    //immutableSet.add(7)
    for(item in immutableSet){
        println(item)
    }


    println("\n----------------------------------")
    println("Inmutable map")
    var immutableMap = mapOf(9 to "Pedro",8 to "Antonio",7 to "Raul")
    // gives compile time error
    //immutableMap.put(9,"Praveen") //put no esta definido
    //El bucle obtiene en key una clave distinta de la colección,
    //itera hasta que se acaban los elementos de la colección
    //dentro accede al elemento cuya clave ha recibido en la iteración.
    for(key in immutableMap.keys){
        println(immutableMap[key])
    }
    val cardinales = mapOf("Norte" to 12, "Sur" to 6, "Este" to 3, "Oeste" to 9)
    println(cardinales)
    cardinales.keys.forEach{println(it)}
    cardinales.values.forEach{println(it)}
    if ("Sur" in cardinales) println("Podemos ir al Sur pulsando ${cardinales["Sur"]}")
    if (6 in cardinales.values) println("La tecla 6 permite movimiento")

    println("\n----------------------------------")
    println("Mutable list")


    var mutableList = mutableListOf("Alberto","Nuria","Paola")
    // we can modify the element
    mutableList[0] = "María Pilar"
    // add one more element in the list
    mutableList.add("Carlota")
    for(item in mutableList){
        println(item)
    }

    println("\n----------------------------------")
    println("Mutable set")
    var mutableSet = mutableSetOf<Int>(6,10)
    // adding elements in set
    mutableSet.add(2)
    mutableSet.add(5)
    for(item in mutableSet){
        println(item)
    }
    mutableSet.remove(10)
    println("-----")
    for(item in mutableSet){
        println(item)
    }
    mutableSet.add(10)
    println("-----")
    for(item in mutableSet){
        println(item)
    }
    println("----- adding 10 again")
    mutableSet.add(10)
    for(item in mutableSet){
        println(item)
    }

    println("\n----------------------------------")
    println("Mutable map")
    var mutableMap = mutableMapOf<Int,String>(1 to "Juan",2 to "Nicolás",3 to "Ana")
    // we can modify the element
    mutableMap.put(1,"Juanito")
    // add one more element in the list
    mutableMap.put(4,"Anita")
    for(item in mutableMap.values){
        println(item)
    }
    val mutableCardinales= mutableMapOf("Norte" to 12, "Sur" to 6, "Este" to 3, "Oeste" to 9)
    //Operador indice
    mutableCardinales["SurEste"]=5
    mutableCardinales["SurOste"]=7
    println(mutableCardinales)

    println("\n----------------------------------")
    println("List of Names -> println")
    val myListOfNames = listOf("Pedro", "Pablo", "Antonio", "Lucía", "Carmen")
    println(myListOfNames)
    println("En total ${myListOfNames.size}")

    println("\n----------------------------------")
    println("List of Names -> for loop")
    for (name in myListOfNames){
        println("Nombre: $name")
    }

    println("\n----------------------------------")
    println("List of Names -> .foreach")
    myListOfNames.forEach(){
        println("Nombre $it")
    }
    println("-----")
    //trailing lambda.
    myListOfNames.forEach {
        println("Nombre $it")
    }
    println("-----")
    //trailing lambda + named parameter
    myListOfNames.forEach {nombre:String->
        println("Nombre $nombre")
    }

    println("\n----------------------------------")
    println("MyMutableList adding and removing")
    val myMutableList=mutableListOf(12,45,683,23,12)
    myMutableList.add(0,0)
    myMutableList.forEach{println(it)}
    println("-----")
    myMutableList.add(1,1)
    myMutableList.forEach{println(it)}
    println("-----")
    myMutableList.add(100)
    myMutableList.forEach{println(it)}
    println("-----")
    myMutableList.remove(683)
    myMutableList.removeAt(3)
    myMutableList.forEach{println(it)}

    println("\n----------------------------------")
    println("Invoking Methods on Lists")
    myMutableList.forEach{println(it)}
    println("En total hay : ${myMutableList.size} elementos")
    //Kotlin nos avisa que podemos cambiar get por el operador indice
    println("El segundo elmento es ${myMutableList.get(1)}")
    println("El segundo elmento es ${myMutableList[1]}")
    println("Find Index of First Occurrence of Element in List")
    val list1 = listOf("ab", "bc", "cd", "de", "ef")
    var element = "de"
    val index = list1.indexOf(element)
    list1.forEach{println(it)}
    println("Index of element \"$element\" in the list is $index")

    println("\n----------------------------------")
    println("List.indexOf() to Check if \"$element\" is in List")
    element="de"
    if (list1.indexOf(element) > -1) {
        print("$element is in list.")
    } else {
        print("$element is not in list.")
    }
    //Kotlin no tiene el operador ternario (expresion) ? valortrue : valor false
    //Pero podemos usar:
    val strResult = if (list1.indexOf(element)>-1)  "Esta" else  "No esta"
    println("$element $strResult")

    println("\n----------------------------------")
    println("Inicializando Colecciones con cualquier tipo")
    //queremos una lista mutable de strings
    val miLista = mutableListOf<String>()
    miLista.add("Uno")
    miLista.add("Dos")
    //Ahora metemos un bucle.
    for (i in 1..10){
        miLista.add("Dato $i")
    }
    println(miLista)

    //Si queremos crearlos primero vacios....
    val myList = mutableListOf<String>()
    val mySet = mutableSetOf<Int>()
    val myMap = mutableMapOf<String,Int>()

    println("\n----------------------------------")
    println("Filtrando colecciones")
    println("----------------------------------")

    println("\n----------------------------------")
    println("Filtrando por valor")

    val gHombre=0
    val gMujer=1
    val gOtro=2
    val myMapOfNames = mutableMapOf(
        "Miguel" to gHombre,
        "Ana" to gMujer,
        "Carlos" to gHombre,
        "Alicia" to gMujer,
        "Alba" to gMujer,
        "Reme" to gMujer,
        "Juan" to gOtro,
    )
    myMapOfNames.forEach{println(it.key)}
    val hombres=myMapOfNames.filterValues { it==gHombre }
    println("Chicos ${hombres.keys}")

    println("\nBuscando en una lista")
    println("----------------------------------")
    println(myListOfNames)
    var buscado="Antonio"
    var encontrado = myListOfNames.filter {
        it == buscado
    }
    println(encontrado)
    if (encontrado.size > 0) println("$buscado esta") else println("$buscado no esta")

    var found = myListOfNames.filter { it=="Miguel" }.size>0
    if (found) println("Encontrado") else println("No Encontrado")

    println("\nOtros filtros")
    println("----------------------------------")
    println(myListOfNames)
    var subList = myListOfNames.filter {
        !(it.endsWith('a') ||
          it.endsWith('o'))
    }
    println("----")
    println(subList.map { it.lowercase() })
    println(subList)
    println("----")
    subList = myListOfNames.filter { it.startsWith('L',ignoreCase = true) }
    println(subList)
    subList = myListOfNames.filter { it.contains('l', ignoreCase = true) }
    println(subList)

}

//--------------------------------------------------
//CLASES
//--------------------------------------------------
fun clases(){
    //Ir descomentando por versiones de clase.
//    //v1----------------
//    println("\nUsing BasicCar v1")
//    println("----------------------")
//
//    val myCar = BasicCar()
//    println(myCar) //imprime el codigo de objeto
//    println(myCar.color)
//    println(myCar.model)
//    println("MyCar Info: color=${myCar.color} model=${myCar.model}")
//
//    //Como en v1 las variables son var las puedo cambiar fuera
//    myCar.color="Rojo"
//    myCar.drive();
//    //usando la función Info.
//    myCar.info()
//
//    //v2-------------------
//    println("\nUsing BasicCar v2")
//    println("----------------------")
//
//    val myCar = BasicCar("Verde", "Turbo WX")
//    println(myCar) //imprime el codigo de objeto
//    println(myCar.color)
//    println(myCar.model)
//    println("MyCar Info: color=${myCar.color} model=${myCar.model}")
//
//    //No nos deja modificar las variables val
//    myCar.color="Rojo"
//    //No me deja cambiar el modelo por ser val
//    //myCar.model="XXTurbo"
//    myCar.drive();
//    //usando la función Info.
//    myCar.info()

//    //v3-------------------
//    println("\nUsing BasicCar v3")
//    println("----------------------")
//
//    //Declarar las variables en el constructor primario no ha cambiado
//    //nada de su uso
//    val myCar = BasicCar("Verde", "Turbo WX")
//    println(myCar) //imprime el codigo de objeto
//    println(myCar.color)
//    println(myCar.model)
//    println("MyCar Info: color=${myCar.color} model=${myCar.model}")
//
//    //No nos deja modificar las variables val
//    myCar.color="Rojo"
//    //No me deja cambiar el modelo por ser val
//    //myCar.model="XXTurbo"
//    myCar.drive();
//    //usando la función Info.
//    myCar.info()
//
//    val otherCar=BasicCar(color = "Negro", model = "jET")
//    otherCar.info()

//    //v4-------------------
//    println("\nUsing BasicCar v4")
//    println("----------------------")
//
//    //Declarar las variables en el constructor primario no ha cambiado
//    //nada de su uso
//    val myCar = BasicCar("Verde", "Turbo WX")
//    println(myCar) //imprime el codigo de objeto
//    println(myCar.color)
//    println(myCar.model)
//    println("MyCar Info: color=${myCar.color} model=${myCar.model}")
//
//    //No nos deja modificar las variables val
//    myCar.color="Rojo"
//    //No me deja cambiar el modelo por ser val
//    //myCar.model="XXTurbo"
//    myCar.drive();
//    //usando la función Info.
//    myCar.info()
//
//    //Llamamos al constructor secundario
//    var otherCar=BasicCar(color = "Negro", model = "jET", petrolConsumption = 5.4f)
//    otherCar.info()
//
//    //llamamos al constructor sin parametros,
//    otherCar = BasicCar()
//    otherCar.info()

//    //v5-------------------
//    println("\nUsing BasicCar v5")
//    println("----------------------")
//
//    //Declarar las variables en el constructor primario no ha cambiado
//    //nada de su uso
//    val myCar = BasicCar("Verde", "Turbo WX")
//    println(myCar) //imprime el codigo de objeto
//    println(myCar.color)
//    println(myCar.model)
//    println("MyCar Info: color=${myCar.color} model=${myCar.model}")
//
//    //No nos deja modificar las variables val
//    myCar.color="Rojo"
//    //No me deja cambiar el modelo por ser val
//    //myCar.model="XXTurbo"
//    myCar.drive();
//    //usando la función Info.
//    myCar.info()
//
//    //Llamamos al constructor secundario
//    var otherCar=BasicCar(color = "Negro", model = "jET", petrolConsumption = 5.4f)
//    otherCar.info()

//    println("\nUsing Car v1")
//    println("----------------------")
//    //Creando objetos
//    var audi = Car()
//    audi.info()
//    var bmw = Car()
//    bmw.info()
//    var opel=Car()
//    opel.info()

//    println("\nUsing Car v2")
//    println("----------------------")
//    //Creando objetos
//    var audi = Car("audi800",3406, 205.4)
//    audi.info()
//
//    println("-----")
//    var bmw = Car("BMW5",56, 302.1, petrolComsumtion = 10.5f)
//    bmw.info()
//
//    println("-----")
//    var renault = Car("R5",345, 127.8, color="Rojo")
//    renault.info()
//
//    println("-----")
//    var otro = Car(5)
//    otro.info()
//
//    println("-----")
//    otro.drive()
//    otro.info()

//    println("\nUsing Car v3 y DrivingClassCar")
//    println("----------------------")
//    //Herencia y sobrecarga
//    //creamos una instancia de DrivingClassCar y vemos su info
//    var dcCar=DrivingClassCar(model="Renault Clio")
//    dcCar.info()
//
//    println("-----")
//    dcCar.drive()
//    dcCar.info()
//
//    println("-----")
//    val otro=Car(5)
//    otro.drive()
//    otro.info()
//
//    println("-----")
//    dcCar.drive(1.0)
//    dcCar.info()

//    println("\nDerived class initialization order")
//    println("----------------------")
//    //https://kotlinlang.org/docs/inheritance.html#derived-class-initialization-order
//    println("Constructing the derived class(\"hello\", \"world\")")
//    Derived("hello", "world")
//
//    println("\nCalling the superclass implementation FilledRectangle v1")
//    println("----------------------")
//    val fr = FilledRectangle()
//    fr.draw()

//    println("\nCalling the superclass implementation FilledRectangle v2")
//    println("----------------------")
//    val fr = FilledRectangle()
//    fr.draw()

//    println("\nNon Default Setters - Girl example")
//    println("----------------------")
//    val maria = Girl()
//    maria.actualAge = 15
//    maria.age = 15
//    println("Maria: actual age = ${maria.actualAge}")
//    println("Maria: pretended age = ${maria.age}")
//
//    val ana = Girl()
//    ana.actualAge = 25
//    ana.age = 25
//    println("Ana: actual age = ${ana.actualAge}")
//    println("Ana: pretended age = ${ana.age}")
//
//    val angela = Girl()
//    angela.actualAge = 35
//    angela.age = 35
//    println("Angela: actual age = ${angela.actualAge}")
//    println("Angela: pretended age = ${angela.age}")
}
