package com.amm.kotlinplayground

class Finder<T> (private val list: List<T>){
    //La funcion recibe una función para aplicar al elemento encontrado
    fun findItem(element:T, caseSensitive:Boolean = true, doWithFound: (element:T?) -> Unit ){
        var stringMode = false

        if (!caseSensitive && element!!::class.simpleName == "String"){
            stringMode = true
        }
        val itemFoundList = list.filter{
            if (stringMode)
                it.toString().lowercase()==element.toString().lowercase()
            else
                it==element
        }
        if (itemFoundList.isNullOrEmpty()) doWithFound(null)
        else doWithFound(itemFoundList.first())
    }
}