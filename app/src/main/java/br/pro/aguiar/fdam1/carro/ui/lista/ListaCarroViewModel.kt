package br.pro.aguiar.fdam1.carro.ui.lista

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdam1.carro.database.AppDatabase
import br.pro.aguiar.fdam1.carro.model.Carro

class ListaCarroViewModel(var appDatabase: AppDatabase) : ViewModel() {
    private val _carros = MutableLiveData<List<Carro>>()
    val carros: LiveData<List<Carro>>
        get() = _carros

    init {
        _carros.value = appDatabase.all()
    }

    fun delete(carro: Carro) {
        appDatabase.delete(carro)
    }
}