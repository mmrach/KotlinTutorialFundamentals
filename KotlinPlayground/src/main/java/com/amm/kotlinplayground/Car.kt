package com.amm.kotlinplayground

////v1------------------------------
//class Car {
//    constructor(){
//        println("Entering default constructor")
//    }
//
//    companion object{
//        var objNum:Int=0
//    }
//
//    // init calling :- init is a type of constructor which is called it-self
//    // while we create Object. Let us understand by using init
//    // for counting number of objects created of a Class.
//    // Here, we are going to use companion object
//    // It means the items common for all objects and can be accessed by Class Only.
//    init {
//        objNum+=1
//    }
//
//    fun info(){
//        println("Obj. Number #$objNum")
//    }
//}

////v2------------------------------
//class Car(val model:String, val engineNumber:Int, val speed:Double) {
//
//    var color:String =""
//    var petrolComsumtion:Float = 0.0f
//    var numAirbags=2
//    var driving:Boolean = false //Inicialmente está parado
//    var currentSpeed:Double = 0.0 //
//
//
//    //NOTE:- val or var is NOT ALLOWED in secondary constructor arguments.
//    //Note:- Secondary Constructor must call primary constructor using “this” if the primary constructor doesn’t have default values.
//
//    constructor(model:String, engineNumber:Int, speed:Double, petrolComsumtion:Float) : this(model,engineNumber,speed) {
//        println("Constructor petrol")
//        this.petrolComsumtion=petrolComsumtion
//    }
//
//    constructor(model:String, engineNumber:Int, speed:Double, color:String) : this(model,engineNumber,speed) {
//        println("Constructor color")
//        this.color=color
//    }
//
//    constructor(numAirbags:Int) : this(model="NoModel", engineNumber=0, speed=100.0){
//        println("Constructor numAirbags")
//        this.numAirbags=numAirbags
//    }
//    companion object{
//        var objNum:Int=0
//    }
//
//    // init calling :- init is a type of constructor which is called it-self
//    // while we create Object. Let us understand by using init
//    // for counting number of objects created of a Class.
//    // Here, we are going to use companion object
//    // It means the items common for all objects and can be accessed by Class Only.
//    init {
//        println("Entering init")
//        objNum+=1
//    }
//
//    fun info(){
//        println("Obj. Number #$objNum")
//        println("Car Model: $model")
//        println("Color $color")
//        println("Petrol Consumption $petrolComsumtion")
//        println("Num Airbags $numAirbags")
//        if (driving) {
//            println("Driving. Current Speed =$currentSpeed")
//        }
//        else{
//            println("Car stoped.")
//        }
//    }
//
//    fun drive(pctSpeed:Double=0.1){
//        //Inicialmente se pone al 30% de su velocidad máxima
//        currentSpeed=speed*pctSpeed;
//        driving=true;
//    }
//
//    fun stop(){
//        //Paramos el vehiculo
//        currentSpeed=0.0
//        driving=false
//    }
//}

//v3------------------------------
//Herencia de Car. Clase hija DrivingClassCar. La clase debe estar Open
open class Car(val model:String, val engineNumber:Int, val speed:Double) {

    var color:String =""
    var petrolComsumtion:Float = 0.0f
    var numAirbags=2
    var driving:Boolean = false //Inicialmente está parado
    var currentSpeed:Double = 0.0 //
    val objNumber:Int;


    //NOTE:- val or var is NOT ALLOWED in secondary constructor arguments.
    //Note:- Secondary Constructor must call primary constructor using “this” if the primary constructor doesn’t have default values.

    constructor(model:String, engineNumber:Int, speed:Double, petrolComsumtion:Float) : this(model,engineNumber,speed) {
        println("Constructor petrol")
        this.petrolComsumtion=petrolComsumtion
    }

    constructor(model:String, engineNumber:Int, speed:Double, color:String) : this(model,engineNumber,speed) {
        println("Constructor color")
        this.color=color
    }

    constructor(numAirbags:Int) : this(model="NoModel", engineNumber=0, speed=100.0){
        println("Constructor numAirbags")
        this.numAirbags=numAirbags
    }

    companion object{
        var numObjects:Int=0
    }

    // init calling :- init is a type of constructor which is called it-self
    // while we create Object. Let us understand by using init
    // for counting number of objects created of a Class.
    // Here, we are going to use companion object
    // It means the items common for all objects and can be accessed by Class Only.
    init {
        println("Entering init")
        numObjects+=1
        objNumber= numObjects
    }

    fun info(){
        println("Obj. Number #$objNumber")
        println("Car Model: $model")
        println("Color $color")
        println("Petrol Consumption $petrolComsumtion")
        println("Num Airbags $numAirbags")
        if (driving) {
            println("Driving. Current Speed =$currentSpeed")
        }
        else{
            println("Car stoped.")
        }
    }

    open fun drive(pctSpeed:Double=0.1){
        //Inicialmente por defecto se pone al 10% de su velocidad máxima
        //No se permite más de un 100% (1.0) de pctSpeed
        val pctSpeed = if (pctSpeed>1.0) 1.0 else pctSpeed
        currentSpeed=speed*pctSpeed;
        driving=true;
    }

    fun stop(){
        //Paramos el vehiculo
        currentSpeed=0.0
        driving=false
    }
}
