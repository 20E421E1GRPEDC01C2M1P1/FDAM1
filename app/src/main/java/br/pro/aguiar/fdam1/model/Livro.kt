package br.pro.aguiar.fdam1.model

import java.io.Serializable

class Livro(
    var titulo: String,
    var autores: String)
    : Serializable
{
    override fun toString(): String {
        return "$titulo"
    }
}
