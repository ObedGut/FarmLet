package com.example.farmlet

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.farmlet.databinding.ActivityAddMedicineBinding

class AddMedicine : AppCompatActivity() {

    //Adding viewBinding
    private lateinit var binding: ActivityAddMedicineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddMedicineBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}