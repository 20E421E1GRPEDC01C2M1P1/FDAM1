package br.pro.aguiar.jokenpo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.jokenpo.viewmodel.AppViewModel
import kotlinx.android.synthetic.main.fragment_jogo.*


class JogoFragment : Fragment() {

    private lateinit var appViewModel: AppViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        appViewModel =
            ViewModelProvider(requireActivity())
                .get(AppViewModel::class.java)

        appViewModel.let {
            it.jogo
            .observe(viewLifecycleOwner) {
                textViewJogoNomeJogador.text = it.nomeJogador
            }

            it.jogada
                .observe(viewLifecycleOwner) {
                    textViewResultadosJogada.text = when (it) {
                        null -> "Empate!"
                        true -> "Você Ganhou!"
                        false -> "Você Perdeu!"
                    }
                }

            it.opcaoMaquina
                .observe(viewLifecycleOwner) {
                    if (!it.isNullOrBlank())
                        textViewOpcaoMaquina.text = it
                }
        }
        return inflater.inflate(R.layout.fragment_jogo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imgViewPedra.setOnClickListener(this::selecionarOpcao)
        imgViewPapel.setOnClickListener(this::selecionarOpcao)
        imgViewTesoura.setOnClickListener(this::selecionarOpcao)
    }

    fun selecionarOpcao(view: View) {
        view as ImageView
        imgViewPedra.isEnabled = false
        imgViewPedra.alpha = 0.2f
        imgViewPapel.isEnabled = false
        imgViewPapel.alpha = 0.2f
        imgViewTesoura.isEnabled = false
        imgViewTesoura.alpha = 0.2f

        val opcaoJogador = when(view.id) {
            R.id.imgViewPedra -> 0
            R.id.imgViewPapel -> 1
            R.id.imgViewTesoura -> 2
            else -> 0
        }

        appViewModel.verificarJogada(opcaoJogador)
    }

}