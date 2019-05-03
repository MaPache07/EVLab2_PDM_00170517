package com.example.paletacolores.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.paletacolores.R
import kotlinx.android.synthetic.main.content_static.view.*
import java.lang.Exception

class FragmentStatic : Fragment(){

    var click : OnColorClickListener? = null

    interface OnColorClickListener{

        fun changeColorOnClickListener(id : Int)

    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if(context is OnColorClickListener) {
            click = context
        } else throw Exception()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.content_static, container)
        view.action_anterior.setOnClickListener { click!!.changeColorOnClickListener(R.id.action_anterior) }
        view.action_siguiente.setOnClickListener { click!!.changeColorOnClickListener(R.id.action_siguiente) }
        return view
    }

    override fun onDetach() {
        super.onDetach()
        click = null
    }

}