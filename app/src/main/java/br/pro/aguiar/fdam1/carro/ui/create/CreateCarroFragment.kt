package br.pro.aguiar.fdam1.carro.ui.create

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import br.pro.aguiar.fdam1.R
import br.pro.aguiar.fdam1.carro.database.AppDatabase
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.create_carro_fragment.*

class CreateCarroFragment : Fragment() {

    private lateinit var createCarroViewModel: CreateCarroViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.create_carro_fragment, container, false)
        createCarroViewModel =
            ViewModelProvider(
                    this,
                    CreateCarroViewModelFactory(AppDatabase.getInstance())
                )
                .get(CreateCarroViewModel::class.java)

        createCarroViewModel.let {
            it.status
                .observe(viewLifecycleOwner){
                    if (it)
                        findNavController().popBackStack()
                }
            it.msg
                .observe(viewLifecycleOwner){
                    if (!it.isNullOrBlank())
                        Snackbar.make(
                            create_carro_layout_root,
                            it,
                            Snackbar.LENGTH_LONG
                        ).show()
                }
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fabCreateCarroSalvar.setOnClickListener {

            // Validacao do formulario

            createCarroViewModel
                .store(
                    editTextCreateCarroMarca.text.toString(),
                    editTextCreateCarroModelo.text.toString(),
                    editTextCreateCarroPlaca.text.toString(),
                    editTextCreateCarroPortas.text.toString()
                )
        }
    }

}