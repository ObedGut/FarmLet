package com.example.farmlet.views.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.farmlet.R
import com.example.farmlet.databinding.FragmentDashboardBinding


class dashboardFragment : Fragment() {

    private lateinit var binding: FragmentDashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentDashboardBinding.inflate(inflater)

        return binding.root
    }




}