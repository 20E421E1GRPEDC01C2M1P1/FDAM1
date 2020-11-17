package br.pro.aguiar.fdam1.ui.dado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.pro.aguiar.fdam1.R
import kotlinx.android.synthetic.main.fragment_dado.*
import java.util.*

class DadoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(
            R.layout.fragment_dado,
            container,
            false)
        //
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnLancarDado.setOnClickListener {
            textViewD6.text = (Random().nextInt(6) + 1).toString()
        }
    }

}