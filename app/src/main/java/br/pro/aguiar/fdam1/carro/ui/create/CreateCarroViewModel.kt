package br.pro.aguiar.fdam1.carro.ui.create

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdam1.carro.database.AppDatabase
import br.pro.aguiar.fdam1.carro.model.Carro

class CreateCarroViewModel(var instance: AppDatabase) : ViewModel() {

    private val _msg = MutableLiveData<String>()
    val msg: LiveData<String>
        get() = _msg

    private val _status = MutableLiveData<Boolean>()
    val status: LiveData<Boolean>
        get() = _status

    init {
        _status.value = false
        _msg.value = null
    }

    fun store(
        marca: String,
        modelo: String,
        placa: String,
        portas: String
    ){
        instance.store(
            Carro(
                marca, modelo, placa, portas.toInt()
            )
        )

        if (true){
            _status.value = true
            _msg.value = "${marca}, ${modelo} persistido com sucesso!"
        }
    }
}