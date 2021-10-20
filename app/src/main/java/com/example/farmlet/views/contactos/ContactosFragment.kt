package com.example.farmlet.views.contactos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.farmlet.R
import com.example.farmlet.databinding.FragmentContactosBinding

class ContactosFragment : Fragment() {
    private lateinit var binding: FragmentContactosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContactosBinding.inflate(inflater)
        return binding.root
    }

}