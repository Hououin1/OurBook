package com.example.ourbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ourbook.databinding.ActivityAboutBookBinding

class AboutBookActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBookBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBookBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener{
            finish()
        }
    }
}