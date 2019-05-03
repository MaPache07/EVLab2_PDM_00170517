package com.example.paletacolores.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.paletacolores.R
import com.example.paletacolores.utilities.AppConstants
import kotlinx.android.synthetic.main.content_dinamic.view.*

class FragmentDinamic : Fragment() {

    private lateinit var arrayColor : ArrayList<Int>
    private var index : Int = 0
    lateinit var click : OnToneClickListener

    companion object {
        fun newInstance(array : ArrayList<Int>, index : Int) : FragmentDinamic{
            var fragment = FragmentDinamic()
            fragment.arrayColor = array
            fragment.index = index
            return fragment
        }
    }

    interface OnToneClickListener{

        fun changeToneOnClickListener()

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.content_dinamic, container, false)

        if (savedInstanceState != null){
            index = savedInstanceState.getInt(AppConstants.COLOR_KEY)
        }
        view.view_color.setBackgroundResource(arrayColor[index])
        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(AppConstants.COLOR_KEY, index)
    }
}