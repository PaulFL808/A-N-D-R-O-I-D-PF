package com.example.proyecto002

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyecto002.databinding.ActivityFullscreenBinding

class FullscreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFullscreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivityFullscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val val1 = binding.et1.text.toString().toIntOrNull() ?: 0
            val val2 = binding.et2.text.toString().toIntOrNull() ?: 0
            val result = val1 + val2
            binding.tv1.text = "Resultado: $result"
        }
    }
}