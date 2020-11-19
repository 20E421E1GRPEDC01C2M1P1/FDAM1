package br.pro.aguiar.fdam1.carro.ui.show

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdam1.carro.database.AppDatabase
import br.pro.aguiar.fdam1.carro.model.Carro

class ShowCarroViewModel(var appDatabase: AppDatabase) : ViewModel() {

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

    fun delete(carro: Carro) {
        _msg.value = "Efetuando a exclusão do registro."
        appDatabase.delete(carro)

        // if (sucesso)
        _msg.value = "Exclusão realizada com sucesso."
        _status.value = true
    }
}