package br.pro.aguiar.fdam1.ui.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdam1.R
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private lateinit var dashboardViewModelFactory: DashboardViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(
            R.layout.fragment_dashboard,
            container,
            false)

        dashboardViewModelFactory = DashboardViewModelFactory()
        var viewModelProvider = ViewModelProvider(requireActivity(), dashboardViewModelFactory)
        dashboardViewModel = viewModelProvider
            .get(DashboardViewModel::class.java)

        dashboardViewModel.carrinhoCompras.observe(viewLifecycleOwner) { novoValorQuantidadeCarrinho ->
            textViewDashBoardCarrinho.text = novoValorQuantidadeCarrinho?.toString()
        }

        dashboardViewModel.totalCompra.observe(viewLifecycleOwner) {
            textViewDashboardTotalCompra.text = it.toString()
        }

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        /*
        dashboardViewModelFactory = DashboardViewModelFactory(10)


        var viewModelProvider = ViewModelProvider(this, dashboardViewModelFactory)

        dashboardViewModel = viewModelProvider
                                .get(DashboardViewModel::class.java)

        dashboardViewModel.carrinhoCompras.observe(
            viewLifecycleOwner) { novoValorQuantidadeCarrinho ->
                textViewDashBoardCarrinho.text = novoValorQuantidadeCarrinho?.toString()
            }


        btnDashboardAdd.setOnClickListener {
            dashboardViewModel.addCarrinho()
        }

        btnDashboardSub.setOnClickListener {
             dashboardViewModel.subCarrinho()
        }

         */
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnDashboardAdd.setOnClickListener {
            dashboardViewModel.addCarrinho()
        }
        btnDashboardSub.setOnClickListener {
            dashboardViewModel.subCarrinho()
        }
    }

}