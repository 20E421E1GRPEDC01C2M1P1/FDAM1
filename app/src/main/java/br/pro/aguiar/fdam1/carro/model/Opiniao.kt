package br.pro.aguiar.fdam1.carro.model

class Opiniao (
    var autor: String,
    var conteudo: String
) {
    override fun toString(): String {
        return "$autor:\t$conteudo"
    }
}
