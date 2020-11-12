package br.pro.aguiar.fdam1.ui.dashboard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdam1.model.Produto

class DashboardViewModel(quantidade: Int = 1) : ViewModel() {

    private val produto = Produto("Resma de Papel", 20.00f)
    var totalCompra = MutableLiveData<Float>()
    var carrinhoCompras = MutableLiveData<Int>()

    init {
        carrinhoCompras.value = quantidade
        atualizarTotalCompra()
    }

    private fun atualizarTotalCompra() {
        totalCompra.value = produto.preco * carrinhoCompras.value!!
    }

    fun addCarrinho() {
        carrinhoCompras.value = carrinhoCompras.value?.plus(1)
        atualizarTotalCompra()
    }

    fun subCarrinho() {
        carrinhoCompras.value = carrinhoCompras.value?.minus(1)
        atualizarTotalCompra()
    }
}