package br.pro.aguiar.fdam1.carro.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.pro.aguiar.fdam1.R
import br.pro.aguiar.fdam1.carro.model.Opiniao
import kotlinx.android.synthetic.main.list_opiniao_recycler.view.*

class OpiniaoRecyclerAdapter (
  private val opinioes: List<Opiniao>
) : RecyclerView.Adapter
        <OpiniaoRecyclerAdapter.OpiniaoViewHolder>() {

    class OpiniaoViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView) {
        val textViewUsuario = itemView.textViewRecylerOpiniaoUsuario
        val textViewConteudo = itemView.textViewRecylerOpiniaoConteudo
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : OpiniaoViewHolder {
        // inflar o layout modelo
        val view = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.list_opiniao_recycler,
                parent,
                false
            )
        // instanciar a ViewHolder
        val opiniaoViewHolder = OpiniaoViewHolder(view)
        // retornar a ViewHolder
        return opiniaoViewHolder
    }

    override fun onBindViewHolder(holder: OpiniaoViewHolder, position: Int) {
        val opiniao = opinioes.get(position)
        holder.textViewUsuario.text = opiniao.autor
        holder.textViewConteudo.text = opiniao.conteudo
    }

    override fun getItemCount(): Int = opinioes.size
}