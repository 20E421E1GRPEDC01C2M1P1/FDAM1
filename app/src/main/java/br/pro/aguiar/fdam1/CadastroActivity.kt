package br.pro.aguiar.fdam1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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