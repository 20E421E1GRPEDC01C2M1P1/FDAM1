package br.pro.aguiar.fdam1.ui.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        return inflater.inflate(
            R.layout.fragment_dashboard,
            container,
            false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        dashboardViewModelFactory = DashboardViewModelFactory()
        var ViewModelProvider = ViewModelProvider(this, dashboardViewModelFactory)
        dashboardViewModel = ViewModelProvider
                                .get(DashboardViewModel::class.java)

        textViewDashBoardCarrinho.text = dashboardViewModel.carrinhoCompras.toString()
        btnDashboardAdd.setOnClickListener {
            textViewDashBoardCarrinho.text = dashboardViewModel.addCarrinho().toString()
        }
        btnDashboardSub.setOnClickListener {
            textViewDashBoardCarrinho.text = dashboardViewModel.subCarrinho().toString()
        }
    }

}