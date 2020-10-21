package com.example.hellokotlin

class Programmer(val name:String,val age:Int,val languages: Array<Language>, val fiends:Array<Programmer>? = null) {
    //val variable no cambia
    //var variable que puede cambiar

    enum class Language(){
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT
    }

    fun code(){
        for (languages:Language in languages){
            println("Estoy programando en $languages")
        }
    }

}