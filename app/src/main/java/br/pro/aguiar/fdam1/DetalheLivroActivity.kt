package br.pro.aguiar.fdam1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.pro.aguiar.fdam1.model.Livro
import kotlinx.android.synthetic.main.activity_detalhe_livro.*

class DetalheLivroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_livro)

        // livro
        var livro = intent.getSerializableExtra("livro") as Livro
        textViewLivroTitulo.text = livro.titulo
        textViewLivroAutores.text = livro.autores

    }
}