package br.pro.aguiar.fdam1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.pro.aguiar.fdam1.model.Usuario
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_resultado_imc.*

class ResultadoImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_imc)

        var usuario = intent.getSerializableExtra("usuario") as Usuario

        var peso = usuario.peso         // float kg
        var altura = usuario.altura     // Int cm

        var imc = peso / (altura * altura)
        var classificacao = ""
        //Classificacao
        // menor que 18.5       - Magreza
        // entre 18.5 e 24,9    - Normal
        // entre 25,0 e 29,9    - Sobrepeso
        // entre 30,0 e 39,9    - Obesidade
        // acima de 40,0        - Obesidade Grave

        if (imc < 18.5) {
            classificacao = "Magreza"
        } else if (imc in 18.5..24.9) {
            classificacao = "Normal"
        } else if (imc in 25.0..29.9) {
            classificacao = "Sobrepeso"
        } else if (imc in 30.0..39.9) {
            classificacao = "Obesidade"
        } else {
            classificacao = "Obesidade Grave"
        }

        textViewUsuarioInfo.text =
            usuario.toString() +
                    "\nIMC:\t$imc\n" +
                    "Classificação:\t$classificacao"

    }
}