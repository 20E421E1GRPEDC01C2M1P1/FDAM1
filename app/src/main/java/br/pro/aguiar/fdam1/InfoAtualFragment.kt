package br.pro.aguiar.fdam1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_info_atual.*

class InfoAtualFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_info_atual,
            container,
            false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textViewLivroAtualTitulo.text = "Android com Kotlin"
        textViewLivroAtualAutor.text = "João Borges"
        textViewLivroAtualQuantidadePaginas.text = "500"
        textViewLivroAtualPaginaAtual.text = "400"
    }
}