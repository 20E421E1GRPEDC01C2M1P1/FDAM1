package br.pro.aguiar.fdam1.carro.ui.lista

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdam1.carro.database.AppDatabase
import java.lang.IllegalArgumentException

class ListaCarroViewModelFactory(var appDatabase: AppDatabase)
    : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ListaCarroViewModel::class.java))
            return ListaCarroViewModel(appDatabase) as T
        throw IllegalArgumentException("Argumento ilegal.")
    }

}