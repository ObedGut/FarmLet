package com.example.farmlet.views.promociones

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.farmlet.R
import com.example.farmlet.databinding.FragmentPromocionesBinding


class PromocionesFragment : Fragment() {
    private lateinit var binding: FragmentPromocionesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPromocionesBinding.inflate(inflater)
        return binding.root
    }

}