package br.pro.aguiar.fdam1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exercico_frag.*

class ExercicoFragActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercico_frag)

//        btnAcessar.setOnClickListener {
//            var livrosIntent = Intent(
//                this,
//                LivrosActivity::class.java
//            )
//            startActivity(livrosIntent)
//        }
    }
}