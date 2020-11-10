package br.pro.aguiar.fdam1.model

import java.io.Serializable

class Usuario (
    var nome: String,
    var idade: Int,
    var telefone: String,
    var matricula: Int,
    var peso: Float = 0f,
    var altura: Float = 0f
) : Serializable {
    override fun toString(): String {
        return "Nome:\t$nome\n" +
                "Idade:\t$idade\n" +
                "Telefome:\t$telefone\n" +
                "Matrícula:\t$matricula\n" +
                "Peso:\t$peso kg\n" +
                "Altura:\t$altura cm"

    }

    fun store(){
        // armazena esse usuarios na base
    }
}