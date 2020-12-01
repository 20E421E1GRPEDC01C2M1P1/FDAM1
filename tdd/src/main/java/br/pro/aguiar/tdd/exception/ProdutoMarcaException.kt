package br.pro.aguiar.tdd.exception

object ProdutoMarcaException : Throwable() {
    override val message
        = "Marca do Produto deve ter mais do que 3 caracteres."

}
