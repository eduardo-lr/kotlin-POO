package com.cursosandroidant.tarea4

fun main() {
    val programa = Programa(titulo = "ggg")
    val otroPrograma = Programa()
    val serie = Serie()
    val otraSerie = Serie("hhhh")
    println(programa.toString())
    println(otroPrograma.toString())
    otroPrograma.marcarVisto()
    println(otroPrograma.toString())
    println(serie.toString())
    println(otraSerie.toString())
}