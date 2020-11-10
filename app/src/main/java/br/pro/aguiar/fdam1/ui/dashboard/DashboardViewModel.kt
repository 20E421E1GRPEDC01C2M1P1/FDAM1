package br.pro.aguiar.fdam1.ui.dashboard

import androidx.lifecycle.ViewModel

class DashboardViewModel() : ViewModel() {
    var carrinhoCompras = 0

    fun addCarrinho(): Int {
        carrinhoCompras++
        return carrinhoCompras
    }

    fun subCarrinho(): Int {
        carrinhoCompras--
        return carrinhoCompras
    }
}