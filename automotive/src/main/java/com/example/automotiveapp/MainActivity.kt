package com.example.automotiveapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.automotiveapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize the binding using ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonToFragmentMap = mapOf(
            binding.button1 to Fragment1(),
            binding.button2 to Fragment2(),
            binding.button3 to Fragment3(),
            binding.button4 to Fragment4()
        )

        buttonToFragmentMap.forEach { (button, fragment) ->
            button.setOnClickListener { loadFragment(fragment) }
        }

        loadFragment(Fragment1())
    }

    private fun loadFragment(fragment: Fragment) {
        // Replace the fragment container with the selected fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}