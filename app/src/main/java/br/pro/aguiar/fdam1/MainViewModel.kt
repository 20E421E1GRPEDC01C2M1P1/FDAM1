package br.pro.aguiar.fdam1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdam1.carro.model.Carro

class MainViewModel:  ViewModel() {

    private val _carro = MutableLiveData<Carro>()
    val carro: LiveData<Carro>
        get() = _carro

    fun selectCar(carro: Carro?) {
        _carro.value = carro
    }
}