package com.amm.kotlinplayground

open class Base(val name: String) {

    init {
        println("Initializing a base class")
    }

    open val size: Int =
        name.length.also { println("Initializing size in the base class: $it") }
}

class Derived(
    name: String,
    val lastName: String,
) : Base(name.replaceFirstChar {
    it.uppercase() }.also { println("Argument for the base class: $it")
    })
{
    init { println("Initializing a derived class") }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }
}

////Rectangle v1-------------------------------------
//open class Rectangle {
//    open fun draw() { println("Drawing a rectangle") }
//    val borderColor: String get() = "black"
//}

////FilledRectangle v1--------------------------------
//class FilledRectangle : Rectangle() {
//    override fun draw() {
//        super.draw()
//        println("Filling the rectangle")
//    }
//
//    val fillColor: String get() = super.borderColor
//}

////FilledRectangle v2--------------------------------
//class FilledRectangle: Rectangle() {
//    override fun draw() {
//        val filler = Filler()
//        filler.drawAndFill()
//    }
//
//    inner class Filler {
//        fun fill() { println("Filling") }
//        fun drawAndFill() {
//            super@FilledRectangle.draw() // Calls Rectangle's implementation of draw()
//            fill()
//            println("Drawn a filled rectangle with color ${super@FilledRectangle.borderColor}") // Uses Rectangle's implementation of borderColor's get()
//        }
//    }
//}

////Rectangle v2-------------------------------------
class Rectangle(val width: Double, val height: Double) {
   open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"

//    //primera opcion, indicamos el tipo
//    val area: Double // property type is optional since it can be inferred from the getter's return type
//        get() = this.width * this.height //tabulamos para que se vea que el get es de area pero no hace falta

    //segunda opcion, pero se puede inferir del get()
    val area   // property type is optional since it can be inferred from the getter's return type
        get() = this.width * this.height //tabulamos para que se vea que el get es de area pero no hace falta
}

//v1
class Girl {
    //Le gusta ser mayor cuando es pequeña, tener su edad hasta los 30 y quitarse 3 años a partir de ahi
    var age: Int = 0
        get() = field
        set(value) {
            field = if (value < 18)
                18
            else if (value >= 18 && value <= 30)
                value
            else
                value-3
        }

    var actualAge: Int = 0
}