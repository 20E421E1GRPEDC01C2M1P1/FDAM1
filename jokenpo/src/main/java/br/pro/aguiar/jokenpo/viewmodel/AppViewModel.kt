package br.pro.aguiar.jokenpo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.pro.aguiar.jokenpo.model.Jogo

class AppViewModel: ViewModel() {
    private var _opcaoMaquina = MutableLiveData<String>()
    private val _jogo = MutableLiveData<Jogo>()
    private val _jogada = MutableLiveData<Boolean>()

    val opcaoMaquina: LiveData<String> = _opcaoMaquina
    val jogo: LiveData<Jogo> = _jogo
    val jogada: LiveData<Boolean> = _jogada

    fun iniciarJogo(nomeJogador: String) {
        _jogo.value = Jogo(nomeJogador)
    }

    fun verificarJogada(opcaoJogador: Int) {
        val opcaoMaquina = _jogo.value?.pegarOpcaoMaquina()
        _opcaoMaquina.value = _jogo.value?.opcoes?.get(opcaoMaquina!!)
        _jogada.value = _jogo.value!!.verificarJogada(
            opcaoJogador, opcaoMaquina!!)

    }

}
