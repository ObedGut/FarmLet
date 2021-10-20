package com.example.farmlet.views.splash

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.farmlet.R
import com.example.farmlet.databinding.FragmentSplashBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : Fragment() {

   private lateinit var binding: FragmentSplashBinding
    private lateinit var barNotification : Window

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSplashBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        barNotification = requireActivity().window
        barNotification.statusBarColor = ContextCompat.getColor(requireContext(), R.color.background_primary)

            lifecycleScope.launch(Dispatchers.Main){
                delay(TIME)
                this@SplashFragment.findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToHomeFragment())
            }
    }

    companion object {
        const val TIME:Long = 3000
    }

}