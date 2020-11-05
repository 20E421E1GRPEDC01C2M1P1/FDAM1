package br.pro.aguiar.fdam1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // ~Manipular interface
        return inflater.inflate(R.layout.fragment_dashboard,
            container,
            false)
        // ~Manipular interface
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnDashboardToConfig.setOnClickListener {
            var navController = findNavController()
            navController.navigate(R.id.action_dashboardFragment_to_configFragment)
        }
    }

}