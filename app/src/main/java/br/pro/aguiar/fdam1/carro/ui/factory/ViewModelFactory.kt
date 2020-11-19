package br.pro.aguiar.fdam1.carro.ui.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdam1.carro.database.AppDatabase
import br.pro.aguiar.fdam1.carro.ui.create.CreateCarroViewModel
import br.pro.aguiar.fdam1.carro.ui.lista.ListaCarroViewModel
import br.pro.aguiar.fdam1.carro.ui.show.ShowCarroViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory(var appDatabase: AppDatabase)
    : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(ListaCarroViewModel::class.java))
            return ListaCarroViewModel(appDatabase) as T

        if (modelClass.isAssignableFrom(CreateCarroViewModel::class.java))
            return CreateCarroViewModel(appDatabase) as T

        if (modelClass.isAssignableFrom(ShowCarroViewModel::class.java))
            return ShowCarroViewModel(appDatabase) as T

        throw IllegalArgumentException("Argumento ilegal.")
    }

}