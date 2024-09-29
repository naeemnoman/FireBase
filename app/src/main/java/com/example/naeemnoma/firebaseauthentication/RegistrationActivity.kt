package com.example.naeemnoma.firebaseauthentication

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.AndroidViewModel
import androidx.viewbinding.ViewBinding
import com.example.naeemnoma.firebaseauthentication.ViewModel.AuthViewModels

class RegestrationActivity : AppCompatActivity() {


    private lateinit var viewModel: AuthViewModels
    private lateinit var binding: RegestrationActivity

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = RegestrationActivity.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}