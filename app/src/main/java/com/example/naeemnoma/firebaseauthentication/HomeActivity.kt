package com.example.naeemnoma.firebaseauthentication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.naeemnoma.firebaseauthentication.ViewModel.AuthViewModels
import com.example.naeemnoma.firebaseauthentication.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var viewModels: AuthViewModels
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModels = ViewModelProvider(this).get()
    }
}