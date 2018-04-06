package com.example.belitadev.myapplication.viewholder

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

        itemView.findViewById<ImageView>(R.id.myCard).setOnClickListener({
            listener.onClick(data.id, itemView)
        })
    }

}