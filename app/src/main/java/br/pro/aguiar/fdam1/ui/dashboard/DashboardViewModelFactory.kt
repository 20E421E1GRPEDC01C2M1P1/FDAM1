package br.pro.aguiar.fdam1.ui.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdam1.ui.create.CreateViewModel

class DashboardViewModelFactory(val quantidade: Int)
    : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DashboardViewModel::class.java)) {
            return DashboardViewModel(quantidade) as T
        }
        throw IllegalArgumentException(
            "Deve ser passada a classe DashboardViewModel.")
    }

}