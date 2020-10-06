package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //varibalesYConstantes()
        //tiposDeDatos()
        //sentenciaIf()
        //sentenciaWhen()
        arrays()
    }

    private fun varibalesYConstantes() {
        var myFirstVariable = "Hello Kotlin"

        println(myFirstVariable)
    }

    private fun tiposDeDatos() {
        //Strings
        val myString1 = "Hola Kotlin"
        val myString2 = "Bienvenidos a Android"
        val myString3 = myString1 + "  " + myString2
        println(myString3)

        //Enteros
        val myInt = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        //Decimales
        val myFloat = 1.5f
        val myDouble2 = 2.8
        val myDouble3 = 8.4
        val myDouble4 = myFloat + myDouble2 + myDouble3
        println(myDouble4)

        //Boolean
        val boolean = true
        val boolean2 = false
        println(boolean == boolean2)
        println(boolean && boolean2)
    }

    fun sentenciaIf() {
        val myNumber = 12
        if (myNumber <= 10) {
            println("$myNumber es menor o igul que 10")
        } else {
            println("$myNumber es mayor que 10")
        }
    }

    fun sentenciaWhen() {
        val country = "italia"
        when (country) {
            "España" -> {
                println("El idioma es Español")
            }
            "Mexico" -> {
                println("El idioma es Español")
            }
            "Peru" -> {
                println("El idioma es Español")
            }
            "Argentina" -> {
                println("El idioma es Español")
            }
            "Colombia" -> {
                println("El idioma es Español")
            }
            "EEUU" -> {
                println("El idioma es inglés")
            }
            "Francia" -> {
                println("El idioma es Francés")
            }
            else -> {
                println("No conocemos el idioma")
            }
        }
        val age = 10
        when (age) {
            0, 1, 2 -> {
                println("Eres un bebé")
            }
            in 3..10 -> {
                println("Eres un niño")
            }
            in 11..17 -> {
                println("Eres un adolescente")
            }
            in 18..69 -> {
                println("Eres un adulto")
            }
            in 70..99 -> {
                println("Eres un anciano")
            }
            else -> {
                println("No eres de este mundo")
            }
        }
    }

    fun arrays() {
        val name = "Ivan"
        val apellido = "Redondo"
        val empresa = "IRONET"
        val age = "21"

        val myArray = arrayListOf<String>()
        myArray.add(name)
        myArray.add(apellido)
        myArray.add(empresa)
        myArray.add(age)

        println(myArray)
        //Añadir un conjunto de datos

        myArray.addAll(listOf("Hola", "Bienvenidos al Array"))
        println(myArray)

        // Acceso a datos
        val myEmpresa = myArray[2]
        println(myEmpresa)

        // Modificar datos

        myArray[5] = "No dejes de aprender"
        println(myArray)

        // Eliminar datos array
        myArray.removeAt(4)
        println(myArray)

        // Recoorer un Array por elementos
        myArray.forEach {
            println(it)

         // Otras

            println(myArray.count())
            //myArray.clear()

            //myArray.first()
            //myArray.last()

            //myArray.sort()
        }
    }
}
