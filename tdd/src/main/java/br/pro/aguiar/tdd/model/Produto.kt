package br.pro.aguiar.tdd.model

import br.pro.aguiar.tdd.exception.ProdutoMarcaException
import br.pro.aguiar.tdd.exception.ProdutoNomeException
import br.pro.aguiar.tdd.exception.ProdutoValorException

class Produto(
    var nome: String,
    var marca: String,
    var valor: Double) {

    init {
        if (valor <= 0.00)
            throw ProdutoValorException
        if (nome.length <= 3)
            throw ProdutoNomeException
        if (marca.length <= 3)
            throw ProdutoMarcaException
    }
}
