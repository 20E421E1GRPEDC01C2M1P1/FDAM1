package br.pro.aguiar.fdam1.ui.create

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdam1.ui.dashboard.DashboardViewModel

class CreateViewModelFactory
    : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CreateViewModel::class.java)){
            return CreateViewModel() as T
        }
        throw IllegalArgumentException(
            "Deve ser passada a classe CreateViewModel.")
    }

}