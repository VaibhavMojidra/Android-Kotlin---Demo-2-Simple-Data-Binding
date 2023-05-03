package com.vaibhavmojidra.demo2simpledatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.vaibhavmojidra.demo2simpledatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var isVisible: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            toggleVisibilityBtn.setOnClickListener {
                isVisible = !isVisible
                progressBar.visibility = if (isVisible) View.VISIBLE else View.INVISIBLE
                toggleVisibilityBtn.text = if (isVisible) "Hide" else "Show"
            }
        }
    }
}