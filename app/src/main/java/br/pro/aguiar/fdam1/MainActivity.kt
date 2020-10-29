package br.pro.aguiar.fdam1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.pro.aguiar.fdam1.model.Usuario
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAcessar.setOnClickListener {
            // Pegar o nome
            var nomeCompleto =
                editTextNomeCompleto.text.toString()

            var usuario = Usuario(
                nomeCompleto,
                90,
                "5521999999999",
                192002
            )

            // Intent
            var intent = Intent(this,
                    HomeActivity::class.java)

            intent.putExtra("usuario", usuario)

//            intent.putExtra("nomeDoUsuario", nomeCompleto)
//            intent.putExtra("idadeDoUsuario", 90)
//            intent.putExtra("matriculaDoUsuario", 5647f)

            // Carregar o nome
            startActivity(intent)
        }

        btnCadastrarse.setOnClickListener {
            var intent = Intent(
                    this,
                    CadastroActivity::class.java
            )
            startActivity(intent)
        }

    }
}