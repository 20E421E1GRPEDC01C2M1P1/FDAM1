package br.pro.aguiar.fdam1.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import br.pro.aguiar.fdam1.R
import kotlinx.android.synthetic.main.activity_exercico_frag.*

class ExercicoFragActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercico_frag) // Interface

        bottomNavigationMain                            // Componente BottomNavigaton
            .setupWithNavController(
                findNavController(R.id.navHostMain)     // Componente NavHostFragment
            )
    }
}