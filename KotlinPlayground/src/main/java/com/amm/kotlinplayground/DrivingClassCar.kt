package com.amm.kotlinplayground

class DrivingClassCar(
    model: String="NoModel",
    engineNumber: Int=0,
    speed: Double=100.0,
    petrolComsumtion: Float = 5.6f) :
    Car(model, engineNumber, speed, petrolComsumtion) {

    //EJERCICIO:
    //Sobrecargar la función drive para que la velocidad máxima esté
    // limitada al 80% de la velocidad del constructor.
    override fun drive(pctSpeed:Double){
        super.drive(pctSpeed)
        if (currentSpeed>0.8*speed)
            currentSpeed=0.8*speed
    }
}