package com.example.farmlet.views.medicamentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.farmlet.R
import com.example.farmlet.databinding.FragmentMedicamentosBinding

class MedicamentosFragment : Fragment() {
    private lateinit var binding: FragmentMedicamentosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMedicamentosBinding.inflate(inflater)
        return binding.root
    }

}