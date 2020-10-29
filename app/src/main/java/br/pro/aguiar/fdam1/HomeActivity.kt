package br.pro.aguiar.fdam1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.pro.aguiar.fdam1.model.Usuario
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //var usuarioNome = intent.getStringExtra("nomeDoUsuario")
        //var usuarioIdade = intent.getIntExtra("idadeDoUsuario", 18)

        var usuario = intent.getSerializableExtra("usuario") as Usuario

        textViewUsuario.text = usuario.toString()

    }
}