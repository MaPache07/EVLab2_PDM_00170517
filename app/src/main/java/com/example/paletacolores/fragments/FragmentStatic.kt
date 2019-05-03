package com.example.paletacolores.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.paletacolores.R

class FragmentStatic : Fragment(){

    interface OnColorClickListener{

        fun changeColorOnClickListener()

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.content_static, container)
        return view
    }

}