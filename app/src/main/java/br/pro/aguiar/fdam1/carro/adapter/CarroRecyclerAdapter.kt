package br.pro.aguiar.fdam1.carro.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.pro.aguiar.fdam1.R
import br.pro.aguiar.fdam1.carro.model.Carro
import kotlinx.android.synthetic.main.list_carro_recycler.view.*

class CarroRecyclerAdapter(
  private val carros: List<Carro>,
  private val actionClick: (Carro) -> Unit
) : RecyclerView.Adapter<CarroRecyclerAdapter.CarroViewHolder>() {

    class CarroViewHolder(view: View)
        : RecyclerView.ViewHolder(view) {
        val textViewModelo = view.textViewListCarroModelo
        val textViewMarca = view.textViewListCarroMarca
        val textViewPlaca = view.textViewListCarroPlaca
        val textViewQuantidadeOpiniao = view.textViewListCarroQuantidadeOpiniao
        var btnEditar = view.btnListCarroEditar
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): CarroViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.list_carro_recycler,
                parent,
                false)
        val carroViewHolder = CarroViewHolder(view)
        return carroViewHolder
    }

    override fun onBindViewHolder(holder: CarroViewHolder, position: Int) {
        val carro = carros.get(position)
        holder.textViewModelo.text = carro.modelo
        holder.textViewMarca.text = carro.marca
        holder.textViewPlaca.text = carro.placa
        holder.textViewQuantidadeOpiniao.text = carro.opinioes?.size.toString()
        holder.btnEditar.setOnClickListener {
            actionClick(carro)
        }
    }

    override fun getItemCount(): Int = carros.size

}