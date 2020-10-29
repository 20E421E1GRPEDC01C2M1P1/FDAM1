package br.pro.aguiar.fdam1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.pro.aguiar.fdam1.model.Usuario
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    lateinit var usuario: Usuario

    // 1 - OnCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usuario = intent.getSerializableExtra("usuario") as Usuario
        textViewUsuario.text = usuario.nome

        btnCalcularIMC.setOnClickListener {
            actionCalcularIMC()
        }
    }
    // 2 - OnStart
    // 3 - OnResume
    // 4 - Ativo
    private fun actionCalcularIMC() {
        var altura = editTextFormAltura.text.toString()
        var peso = editTextFormPeso.text.toString()
        usuario.altura = altura.toFloat()
        usuario.peso = peso.toFloat()
        var imc = Intent(this, ResultadoImcActivity::class.java)
        imc.putExtra("usuario", usuario)
        startActivity(imc)
    }


}