package com.proyectoprogramacion4.deslizarseentrefragmentosusandoviewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.proyectoprogramacion4.deslizarseentrefragmentosusandoviewpager.Fragmentos.FragmentoAmarillo
import com.proyectoprogramacion4.deslizarseentrefragmentosusandoviewpager.Fragmentos.FragmentoAzul
import com.proyectoprogramacion4.deslizarseentrefragmentosusandoviewpager.Fragmentos.FragmentoRojo

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.barra_de_fragmentos.*

class MainActivity : AppCompatActivity() {

    var pagerAdapter:adaptadorFragmentos?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar_main)


        pagerAdapter = adaptadorFragmentos(supportFragmentManager)
        pagerAdapter!!.addFragments(FragmentoAmarillo(),"Amarillo")
        pagerAdapter!!.addFragments(FragmentoRojo(),"Rojo")
        pagerAdapter!!.addFragments(FragmentoAzul(),"Azul")
        costomViewPager.adapter = pagerAdapter
        costomTabLayout.setupWithViewPager(costomViewPager)

    }


}
