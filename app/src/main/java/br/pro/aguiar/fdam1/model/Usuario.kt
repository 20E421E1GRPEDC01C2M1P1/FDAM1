package br.pro.aguiar.fdam1.model

import java.io.Serializable

class Usuario (
    var nome: String,
    var idade: Int,
    var telefone: String,
    var matricula: Int
) : Serializable {
    override fun toString(): String {
        return "Nome:\t$nome\n" +
                "Idade:\t$idade\n" +
                "Telefome:\t$telefone\n" +
                "Matrícula:\t$matricula"
    }
}