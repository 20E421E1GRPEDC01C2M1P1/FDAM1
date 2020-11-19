package br.pro.aguiar.fdam1.carro.model

class Carro (
    var marca: String,
    var modelo: String,
    var placa: String,
    var portas: Int,
    var opinioes: List<Opiniao>? = null
) {

    override fun toString(): String {
        return "$modelo ($placa) \t" +
                "${if (opinioes.isNullOrEmpty()) 0 
                    else opinioes!!.size}"
    }

}