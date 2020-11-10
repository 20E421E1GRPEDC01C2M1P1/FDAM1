package br.pro.aguiar.fdam1.ui.create

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdam1.R
import kotlinx.android.synthetic.main.fragment_create.*

class CreateFragment : Fragment() {

    private lateinit var createViewModel: CreateViewModel
    private lateinit var createViewModel2: CreateViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        createViewModel = ViewModelProvider(
                this, CreateViewModelFactory()
            ).get(CreateViewModel::class.java)

        createViewModel2 = ViewModelProvider(
            this, CreateViewModelFactory()
        ).get(CreateViewModel::class.java)

        btnCadastroSalvar.setOnClickListener {
            var usuario = editTextUsuario.text.toString()
            var senha = editTextSenha.text.toString()
            var reSenha = editTextReSenha.text.toString()

            if (senha.compareTo(reSenha) == 0)
                createViewModel.cadastrarUsuario(usuario, senha)
            else
                Toast.makeText(
                    requireContext(),
                    "Senhas não conferem.",
                    Toast.LENGTH_LONG
                ).show()
        }
    }
}