package com.example.farmlet.views.home.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.farmlet.views.contactos.ContactosFragment
import com.example.farmlet.views.medicamentos.MedicamentosFragment
import com.example.farmlet.views.promociones.PromocionesFragment

class HomeAdapter (fa:Fragment) : FragmentStateAdapter(fa){
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {
                MedicamentosFragment()
            }
            1 -> {
                PromocionesFragment()
            }
            2 -> {
                ContactosFragment()
            }
            else -> {
                MedicamentosFragment()
            }
        }
    }
}