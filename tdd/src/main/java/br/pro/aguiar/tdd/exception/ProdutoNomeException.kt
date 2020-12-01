package br.pro.aguiar.tdd.exception

object ProdutoNomeException : Throwable() {
    override val message
        = "Nome do Produto deve ter mais do que 3 caracteres."
}
