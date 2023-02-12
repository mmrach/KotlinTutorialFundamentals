package com.amm.kotlinplayground

//v1------------
class BasicCar {
    var color : String ="white"
    var model : String ="STW"

    fun drive(){
        println("Car is driving .rrrrmm")
    }

    fun info(){
        println("Car Info ------")
        println("Color: $color")
        println("Model: $model")
        println("---------------")
    }
}

////v2------------
////  Primary constructor (sin declaración)
//class BasicCar(color:String, model:String) {
//    var color: String = color
//    val model: String = model
//
//    fun drive() {
//        println("Car is driving .rrrrmm")
//    }
//
//    fun info() {
//        println("Car Info ------")
//        println("Color: $color")
//        println("Model: $model")
//        println("---------------")
//    }
//}

////v3------------
////  Primary constructor (declaramos en el constructor primario)
//class BasicCar(var color:String, val model:String) {
//    //Ya no hace falta declararlas aquí
////    var color: String = color
////    val model: String = model
//
//    fun drive() {
//        println("Car is driving .rrrrmm")
//    }
//
//    fun info() {
//        println("Car Info ------")
//        println("Color: $color")
//        println("Model: $model")
//        println("---------------")
//    }
//}

////v4------------
////  Default constructor vs Primary constructor
////  Default values
//class BasicCar(var color:String ="Blanco", val model:String = "Base") {
//
//    //definimos esta variable, pero pueden acceder de fuera :-)
//    var petrolConsumption:Float = 0.0f
//    constructor(color: String, model:String, petrolConsumption:Float ) : this(color,model) {
//        this.petrolConsumption = petrolConsumption
//    }
//
//    fun drive() {
//        println("Car is driving .rrrrmm")
//    }
//
//    fun info() {
//        println("Car Info ------")
//        println("Color: $color")
//        println("Model: $model")
//        if (petrolConsumption>0)
//            println("Petrol Conumption: $petrolConsumption")
//        println("---------------")
//    }
//}

////v5------------
////  Init Function
//class BasicCar(var color:String, var model:String) {
//
//    //definimos esta variable, pero pueden acceder de fuera :-)
//    var petrolConsumption:Float=0.0f
//    constructor(color: String, model:String, petrolConsumption:Float ) : this(color,model) {
//        println("Entering constructor")
//        this.petrolConsumption = petrolConsumption
//    }
//
//    init {
//        println("Entering init")
//        //Si ponemos esto, cualquier valor que se pase en el construtor primario se ignora
////        color="Blanco"
////        model="Base"
////        petrolConsumption=3.0f
//        //Esta funcion sirve para hacer modificaciones iniciales sobre
//        // los parametor recibidos en el primary constructor
//        this.petrolConsumption=petrolConsumption+1.3f
//        model="M:$model"
//    }
//
//    fun drive() {
//        println("Car is driving .rrrrmm")
//    }
//
//    fun info() {
//        println("Car Info ------")
//        println("Color: ${this.color}")
//        println("Model: ${this.model}")
//        if (petrolConsumption>0)
//            //no hace falta porner this.
//            println("Petrol Conumption: $petrolConsumption")
//        println("---------------")
//    }
//}
