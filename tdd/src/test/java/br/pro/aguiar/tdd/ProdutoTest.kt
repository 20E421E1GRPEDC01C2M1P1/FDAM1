package br.pro.aguiar.tdd
import br.pro.aguiar.tdd.exception.ProdutoMarcaException
import br.pro.aguiar.tdd.exception.ProdutoNomeException
import br.pro.aguiar.tdd.exception.ProdutoValorException
import br.pro.aguiar.tdd.model.Produto
import org.junit.Assert.*
import org.junit.Test

class ProdutoTest {

    @Test
    fun verificarSeOjbetoEhInstanciado(){
        var produto = Produto(
            "Lapis", "Pentel", 9.45
        )
        assertTrue(produto is Produto)
    }

    @Test
    fun verificarSeValorAceitaCentavos(){
        var produto = Produto(
            "Lapis", "Pentel", 9.0
        )
        assertTrue(produto.valor is Double)
    }

    @Test
    fun verificar_se_valor_eh_maior_que_zero(){
        try {
            val produto = Produto("Caneta", "Pentel", -12.90)
            assertTrue(false)
        } catch (e: Throwable) {
            assertEquals(ProdutoValorException.message, e.message)
        }
    }

    @Test
    fun verificar_se_nome_tem_mais_que_tres_caracteres(){
        try {
            val produto = Produto("Pen", "Faber", 8.21)
            assertTrue(false)
        } catch (e: Throwable) {
            assertEquals(ProdutoNomeException.message, e.message)
        }
    }

    @Test
    fun verificar_se_marca_do_produto_tem_mais_que_tres_caracteres(){
        try {
            val produto = Produto("Lapis", "Bic", 6.57)
            assertTrue(false)
        } catch (e: Throwable){
            assertEquals(ProdutoMarcaException.message, e.message)
        }
    }
}