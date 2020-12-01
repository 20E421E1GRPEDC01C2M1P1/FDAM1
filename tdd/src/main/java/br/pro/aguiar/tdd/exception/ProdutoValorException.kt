package br.pro.aguiar.tdd.exception

object ProdutoValorException : Throwable() {
    override val message =
        "Valor do Produto deve ser maior que 0.00"
}
