package br.pro.aguiar.fdam1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.pro.aguiar.fdam1.model.Usuario
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.textView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var quantidadeCarrinho = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewCarrinho.text = /*viewmodel.*/ quantidadeCarrinho.toString()
        btnAdd.setOnClickListener {
            quantidadeCarrinho++
            textViewCarrinho.text = quantidadeCarrinho.toString()
        }
        btnSub.setOnClickListener {
            quantidadeCarrinho--
            textViewCarrinho.text = quantidadeCarrinho.toString()
        }


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
        /*
//        btnCalcularIMC.setOnClickListener {
//            var intent = Intent(
//                this,
//                ResultadoImcActivity::class.java)
//            startActivityForResult(intent, 2)
//        }
 */
        btnCadastrarse.setOnClickListener {
            var intent = Intent(
                    this,
                    CadastroActivity::class.java)
            startActivityForResult(intent, 100)
        }

        textViewHomePage.setOnClickListener {
            val homePageIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/")
            )
            if (homePageIntent.resolveActivity(packageManager) != null) {
                startActivity(homePageIntent)
            }
        }
    }

    override fun onActivityResult(
        requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        var usuario = data?.getStringExtra("usuario")
        editTextNomeCompleto.setText(usuario)
    }
}