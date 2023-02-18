package com.amm.kotlinplayground

class Stack<T> {
    private val elements: MutableList<T> = ArrayList()

    var length:Int=0
        private set
        get() = field

    var isEmpty: Boolean = false
        private set
        get () = length == 0

    fun pop(): T? {
        val element: T
        if (length>0) {
            length -= 1
            element = elements.last()
            elements.removeLast()
            return element
        }
        else return null
    }

    fun push(value: T) {
        elements.add(value)
        length+=1
    }

    fun peek():T?{
        if (length>0) return elements.last()
        else return null
    }

    fun print(){
        if (length>0) {
            elements.forEach {
                print("[$it]")
            }
            println("")
        }
        else println("Empty Stack")
    }
}