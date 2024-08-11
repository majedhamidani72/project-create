package com.example.cusrecyclerfaslha.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cusrecyclerfaslha.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, SubjectsActivity::class.java)

        binding.customRecycler1.setOnClickListener { startActivityWithExtra(intent, 1) }
        binding.customRecycler2.setOnClickListener { startActivityWithExtra(intent, 2) }
        binding.customRecycler3.setOnClickListener { startActivityWithExtra(intent, 3) }
        binding.customRecycler4.setOnClickListener { startActivityWithExtra(intent, 4) }
        binding.customRecycler5.setOnClickListener { startActivityWithExtra(intent, 5) }
        binding.customRecycler6.setOnClickListener { startActivityWithExtra(intent, 6) }
        binding.customRecycler7.setOnClickListener { startActivityWithExtra(intent, 7) }
    }

    private fun startActivityWithExtra(intent: Intent, chapter: Int) {
        intent.putExtra("CHAPTER_NUMBER", chapter)
        startActivity(intent)
    }
}
