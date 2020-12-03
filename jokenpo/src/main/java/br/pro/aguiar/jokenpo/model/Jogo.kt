package br.pro.aguiar.jokenpo.model

import kotlin.random.Random

class Jogo(
    val nomeJogador: String
) {
    var pontuacaoJogador: Int = 0
    var pontuacaoMaquina: Int = 0

    val opcoes = listOf(
        "Pedra", // 0
        "Papel", // 1
        "Tesoura"// 2
    )

    fun pegarOpcaoMaquina() : Int {
        return Random.nextInt(0, 2)
    }

    fun verificarJogada(opcaoJogador: Int, opcaoMaquina: Int): Boolean? {
        return if (opcaoJogador == opcaoMaquina) null
            else opcaoJogador > opcaoMaquina
    }

}