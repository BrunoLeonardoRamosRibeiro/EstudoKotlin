package com.louzeiroribeiro.aulaactivityfragment

import java.io.Serializable

data class Filme(
    val nome: String,
    val descricao: String,
    val avaliacoes: Double,
    val diretor: String,
    val distribuidor: String
): Serializable
