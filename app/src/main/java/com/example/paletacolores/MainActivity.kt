package com.example.paletacolores

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.paletacolores.fragments.FragmentDinamic
import com.example.paletacolores.fragments.FragmentStatic

class MainActivity : AppCompatActivity(), FragmentStatic.OnColorClickListener, FragmentDinamic.OnToneClickListener {

    lateinit var fragment : FragmentDinamic
    var arrayColors = ArrayList<Int>()
    var index : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrayColors.add(R.color.red)
        arrayColors.add(R.color.green)
        arrayColors.add(R.color.blue)

        fragment = FragmentDinamic.newInstance(arrayColors, index)
        supportFragmentManager.beginTransaction().replace(R.id.fragment_dinamic, fragment).commit()
    }

    override fun changeColorOnClickListener() {

    }

    override fun changeToneOnClickListener() {

    }

}
