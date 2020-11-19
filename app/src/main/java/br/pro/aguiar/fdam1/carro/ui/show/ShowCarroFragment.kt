package br.pro.aguiar.fdam1.carro.ui.show

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import br.pro.aguiar.fdam1.MainViewModel
import br.pro.aguiar.fdam1.R
import br.pro.aguiar.fdam1.carro.database.AppDatabase
import br.pro.aguiar.fdam1.carro.model.Carro
import br.pro.aguiar.fdam1.carro.ui.factory.ViewModelFactory
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.show_carro_fragment.*

class ShowCarroFragment : Fragment() {

    private lateinit var showCarroViewModel: ShowCarroViewModel
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.show_carro_fragment, container, false)

        showCarroViewModel =
            ViewModelProvider(
                this, ViewModelFactory(AppDatabase.getInstance()))
                .get(ShowCarroViewModel::class.java)

        mainViewModel =
            ViewModelProvider(requireActivity())
                .get(MainViewModel::class.java)

        mainViewModel
            .carro
            .observe(viewLifecycleOwner) {
                updateUI(it, showCarroViewModel.status.value!!)
            }

        showCarroViewModel
            .msg
            .observe(viewLifecycleOwner) {
                if (!it.isNullOrBlank())
                    showSnackbar(it)
            }

        showCarroViewModel
            .status
            .observe(viewLifecycleOwner) {
                if (it) {
                    mainViewModel.selectCar(null)
                    findNavController().popBackStack()
                }
            }


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fabShowCarroDelete.setOnClickListener {
            var carro = mainViewModel.carro.value
            showCarroViewModel.delete(carro!!)
        }
        fabShowCarroEdit.setOnClickListener {
            findNavController().navigate(R.id.createCarroFragment)
        }
    }

    private fun updateUI(carro: Carro?, status: Boolean) {
        if (carro != null) {
            textViewShowCarroMarca.text = carro.marca
            textViewShowCarroModelo.text = carro.modelo
            textViewShowCarroPlaca.text = carro.placa
            textViewShowCarroPortas.text = carro.portas.toString()
        } else if(!status){
            showSnackbar("Nenhum carro foi selecionado!")
        }
    }
    private fun showSnackbar(msg: String) {
        Snackbar
            .make(
                show_carro_layout_root,
                msg,
                Snackbar.LENGTH_LONG
            ).show()
    }

}