package com.orbitalsonic.includevsviewstub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.orbitalsonic.includevsviewstub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnInclude.setOnClickListener{
            startActivity(Intent(this,ExampleIncludeActivity::class.java))
        }

        binding.btnViewstub.setOnClickListener {
            startActivity(Intent(this,ExampleViewstubActivity::class.java))
        }
    }
}