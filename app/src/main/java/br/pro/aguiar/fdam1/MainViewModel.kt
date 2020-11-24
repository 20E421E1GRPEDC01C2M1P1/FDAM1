package br.pro.aguiar.fdam1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdam1.carro.model.Carro
import java.lang.reflect.Field

class MainViewModel:  ViewModel() {

    // mainViewModel.nome
    // mainViewModel.nome = "Thiago"
//    var nome: String
//        get() = "Nome: $nome"
//        set(value) { field = value }
//    var usuario: Usuario
//    usuario.nome
//    usuario.pontuacao
//    usuario.questoes

    private val _carro = MutableLiveData<Carro>()
    val carro: LiveData<Carro>
        get() = _carro

    fun selectCar(carro: Carro?) {
        _carro.value = carro
    }
}