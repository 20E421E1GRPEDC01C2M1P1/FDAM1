package br.pro.aguiar.fdam1.carro.ui.create

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdam1.carro.database.AppDatabase

class CreateCarroViewModelFactory(var instance: AppDatabase)
    : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CreateCarroViewModel::class.java))
            return CreateCarroViewModel(instance) as T
        throw IllegalArgumentException("Argumento inválido.")
    }

}
