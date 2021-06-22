package com.ashwin.android.observalefield

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.ashwin.android.observalefield.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.updateButton.setOnClickListener {
            // Update user field
            val user = User()
            user.email = binding.emailEdittext.text.toString()
            user.name = binding.nameEdittext.text.toString()
            viewModel.updateUser(user)

            // Update boolean field
            val boolText = binding.boolEdittext.text.toString()
            val b = boolText.toBoolean()
            viewModel.updateBoolean(b)
        }

        binding.mainViewModel = viewModel
    }
}
