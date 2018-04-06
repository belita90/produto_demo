package com.example.belitadev.myapplication.viewholder

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.belitadev.myapplication.R
import com.example.belitadev.myapplication.entities.ProdutoEntity
import com.example.belitadev.rlive.base.entities.listener.IProdutoInteractionListener

class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindData(data: ProdutoEntity, listener: IProdutoInteractionListener) {

        itemView.findViewById<TextView>(R.id.dataProduto).text = data.nome
        aplicaFundo(data)

        itemView.findViewById<ImageView>(R.id.myCard).setOnClickListener({
            listener.onClick(data.id, itemView)
            data.clicado = !data.clicado
            aplicaFundo(data)
        })
    }

    private fun aplicaFundo(data: ProdutoEntity) {
        if (data.clicado) {
            mudaCorDeFundo()
        } else {
            mudaCorDeFundoParaPadrao()
        }
    }

    private fun mudaCorDeFundoParaPadrao() {
        itemView.setBackgroundColor(Color.TRANSPARENT)
    }

    private fun mudaCorDeFundo() {
        itemView.setBackgroundColor(Color.RED)
    }

}