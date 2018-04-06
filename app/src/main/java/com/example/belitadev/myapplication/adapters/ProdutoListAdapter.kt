package com.example.belitadev.myapplication.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.belitadev.myapplication.R
import com.example.belitadev.myapplication.entities.ProdutoEntity
import com.example.belitadev.myapplication.viewholder.ProdutoViewHolder
import com.example.belitadev.rlive.base.entities.listener.IProdutoInteractionListener

class ProdutoListAdapter(var list: List<ProdutoEntity>, listener: IProdutoInteractionListener) : RecyclerView.Adapter<ProdutoViewHolder>() {

    private val listener: IProdutoInteractionListener = listener

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProdutoViewHolder {
        val context = parent?.context
        val inflater = LayoutInflater.from(context)

        val view = inflater.inflate(R.layout.fragment_produto_list_row, parent, false)

        return ProdutoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder?, position: Int) {
        holder?.bindData(list[position], listener)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

}