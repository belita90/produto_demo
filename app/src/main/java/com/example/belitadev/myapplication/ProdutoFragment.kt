package com.example.belitadev.myapplication

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.belitadev.myapplication.adapters.ProdutoListAdapter
import com.example.belitadev.myapplication.mock.ProdutoMock
import com.example.belitadev.rlive.base.entities.listener.IProdutoInteractionListener

class ProdutoFragment : Fragment() {

    private lateinit var mRootView: View
    private lateinit var mRecycleist: RecyclerView
    private lateinit var mInteractionListener: IProdutoInteractionListener
    companion object {
        fun newInstance(): ProdutoFragment {
            return ProdutoFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inicializa listener
        createInteractionListener(inflater, container!!)

        mRootView= inflater.inflate(R.layout.fragment_produto_list, container, false)

        // 1 - OBTER O ELEMENTO
        mRecycleist = mRootView.findViewById(R.id.recycleProdutoList)

        // 2 - DEFINIR UM ADAPTER
        mRecycleist.adapter = ProdutoListAdapter(mutableListOf(), mInteractionListener)

        // 3 - DEFINIR UM LAYOUT
        mRecycleist.layoutManager = LinearLayoutManager(mRootView.context)

        return mRootView
    }

    override fun onResume() {
        super.onResume()
        loadList()
    }

    private fun loadList() {

        var list = ProdutoMock().getList()

        // 2 - DEFINIR UM ADAPTER
        mRecycleist.adapter = ProdutoListAdapter(list, mInteractionListener)
    }

    /**
     * Interação com a listagem
     */
    private fun createInteractionListener(inflater: LayoutInflater, container: ViewGroup) {

        mInteractionListener = object : IProdutoInteractionListener {

            override fun onClick(id: Int, itemView: View) {
                itemView.setBackgroundColor(Color.RED)
            }

        }
    }

}