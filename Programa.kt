package com.cursosandroidant.tarea4

/**
 *  Clase para modelar programas. Un programa tiene
 *  titulo, genero y estado de visualización.
 */
open class Programa {

    /** El título del programa. */
    var titulo = ""
    private set

    /** El género del programa. */
    var genero= Genero.OTRO
    private set

    /** El estado de visualización del programa. */
    var visto = false
    private set

    /** Constructor sin parámetros. */
    constructor()

    /**
     * Constructor con todos los parámetros.
     *  @param titulo el titulo del programa.
     *  @param genero el género del programa.
     *  @param visto el estado de visualización del programa.
     */
    constructor(titulo: String, genero: Genero, visto: Boolean) {
        this.titulo = titulo
        this.genero = genero
        this.visto = visto
    }

    /**
     * Constructor cuando solo se proporciona el título
     * @param titulo el titulo del programa.
     */
    constructor(titulo: String) {
        this.titulo = titulo
    }

    /** Método para marcar en visto un programa. */
    fun marcarVisto() {
        visto = true
    }

    /**
     * Regresa una representación en cadena del programa
     * @return una presentación en cadena del programa
     */
    override fun toString(): String {
        return "titulo: ${titulo}\n"+
                "genero: ${genero}\n"+
                "visto: ${visto}\n"
    }

}
