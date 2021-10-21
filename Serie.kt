package com.cursosandroidant.tarea4

/**
 * Clase para modelar series. Una serie tiene
 * titulo, género, estado de visualización
 * y número de temporadas.
 */
class Serie: Programa {

    /** El número de temporadas de la serie. */
    var temporadas: Short = 0
    private set

    /** Constructor sin parametros. */
    constructor()

    /**
     * Constructor con todos los parámetros.
     *  @param titulo el titulo de la serie.
     *  @param genero el género de la serie.
     *  @param visto el estado de visualización de la serie.
     *  @param temporadas el número de temporadas de la serie.
     */
    constructor(titulo: String, genero: Genero, visto: Boolean,
                temporadas: Short) : super(titulo,genero, visto) {
        this.temporadas = temporadas
    }

    /**
     * Constructor cuando solo se proporciona el título
     * @param titulo el titulo de la serie.
     */
    constructor(titulo: String) : super(titulo)

    /**
     * Constructor cuando solo se proporciona
     * el título y el numero de temporadas.
     * @param titulo el titulo de la serie.
     * @param temporadas el número de temporadas de la serie.
     */
    constructor(titulo: String, temporadas: Short) : super(titulo) {
        this.temporadas = temporadas
    }

    override fun toString(): String {
        return super.toString()+"temporadas: ${temporadas}\n"
    }
}