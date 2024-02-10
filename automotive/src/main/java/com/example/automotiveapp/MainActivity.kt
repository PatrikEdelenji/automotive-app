package com.example.automotiveapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.automotiveapp.databinding.ActivityMainBinding
import com.example.automotiveapp.fragments.Fragment1
import com.example.automotiveapp.fragments.Fragment2
import com.example.automotiveapp.fragments.Fragment3
import com.example.automotiveapp.fragments.Fragment4



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.button1.setOnClickListener { loadFragment(Fragment1()) }
        binding.button2.setOnClickListener { loadFragment(Fragment2()) }
        binding.button3.setOnClickListener { loadFragment(Fragment3()) }
        binding.button4.setOnClickListener { loadFragment(Fragment4()) }

        loadFragment(Fragment1())
    }

    private fun loadFragment(fragment: Fragment) {
        // Replace the fragment container with the selected fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}