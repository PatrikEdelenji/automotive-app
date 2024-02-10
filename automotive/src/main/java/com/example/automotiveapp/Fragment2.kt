// Fragment1.kt
package com.example.automotiveapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("INFO","Fragment2 active")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2, container, false)
    }
}