package br.pro.aguiar.fdam1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAcessar.setOnClickListener {
            var intent = Intent(this,
                    HomeActivity::class.java)
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