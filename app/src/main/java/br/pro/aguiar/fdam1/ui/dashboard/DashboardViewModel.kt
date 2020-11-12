package br.pro.aguiar.fdam1.ui.dashboard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel(quantidade: Int) : ViewModel() {
    var carrinhoCompras = MutableLiveData<Int>()

    init {
       carrinhoCompras.value = quantidade
    }

    fun addCarrinho() /*: Int*/ {
//        var quant = carrinhoCompras.value!!
//        carrinhoCompras.value = quant++
        carrinhoCompras.value = carrinhoCompras.value?.plus(1)
        //return carrinhoCompras.value!!
    }

    fun subCarrinho() /*: Int*/ {
        carrinhoCompras.value = carrinhoCompras.value?.minus(1)
        //return carrinhoCompras.value!!
    }
}