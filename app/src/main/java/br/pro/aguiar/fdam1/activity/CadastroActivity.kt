package br.pro.aguiar.fdam1.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.pro.aguiar.fdam1.R

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        var intentRetorno = Intent()
        intentRetorno.putExtra("usuario", "Thiago Aguiar")
        setResult(1, intentRetorno)
        finish()
    }
}