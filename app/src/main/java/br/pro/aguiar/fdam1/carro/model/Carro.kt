package br.pro.aguiar.fdam1.carro.model

class Carro (
    var marca: String,
    var modelo: String,
    var placa: String,
    var portas: Int
) {

    override fun toString(): String {
        return "$modelo ($placa)"
    }

}