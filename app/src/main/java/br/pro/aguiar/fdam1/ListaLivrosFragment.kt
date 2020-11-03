package br.pro.aguiar.fdam1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import br.pro.aguiar.fdam1.model.Livro
import kotlinx.android.synthetic.main.fragment_lista_livros.*

class ListaLivrosFragment : Fragment() {

    private var livros = listOf(
        Livro("Andoird Kotlin", "Lucas Borges"),
        Livro("Android com Java", "Nathalia Magro"),
        Livro("Android com Flutter", "Nathalia Magro"),
        Livro("Calculo 4", "Lucas Borges")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_lista_livros, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listViewLivros.adapter = ArrayAdapter(
                requireContext(),
                android.R.layout.simple_list_item_1,
                livros
            )
        listViewLivros.setOnItemClickListener { adapterView, view, i, l ->
            var livro = livros[i]
            activity?.let {
                var infoLivroIntent = Intent(
                    it,
                    DetalheLivroActivity::class.java
                )
                infoLivroIntent.putExtra("livro", livro)
                startActivity(infoLivroIntent)
            }

        }
    }

}