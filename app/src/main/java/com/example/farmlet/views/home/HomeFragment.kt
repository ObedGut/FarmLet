package com.example.farmlet.views.home

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.core.content.ContextCompat
import com.example.farmlet.R
import com.example.farmlet.databinding.FragmentHomeBinding
import com.example.farmlet.views.home.adapter.HomeAdapter
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val tabTitle = arrayOf("Medicamentos","Promociones","Contactos")
    private val _adapter by lazy { HomeAdapter(this) }
    private lateinit var barNotification : Window


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        barNotification = requireActivity().window
        barNotification.statusBarColor = ContextCompat.getColor(requireContext(), R.color.background_primary)

        binding.viewpager2.adapter = _adapter
        val tabLayoutMediator = TabLayoutMediator(binding.Tablayout, binding.viewpager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = tabTitle[position]
                    tab.setIcon(R.drawable.icon_medicament)
                }
                1 -> {
                    tab.text = tabTitle[position]
                    tab.setIcon(R.drawable.icon_promociones)
                }
                2 -> {
                    tab.text = tabTitle[position]
                    tab.setIcon(R.drawable.icon_contact)
                }
            }
        }
        tabLayoutMediator.attach()


    }

}