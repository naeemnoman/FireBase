package com.example.naeemnoma.firebaseauthentication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.naeemnoma.firebaseauthentication.ViewModel.AuthViewModels
import com.example.naeemnoma.firebaseauthentication.databinding.ActivityRegestrationBinding

class RegistrationActivity : AppCompatActivity() {


    private lateinit var viewModel: AuthViewModels
    private lateinit var binding: ActivityRegestrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityRegestrationBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(AuthViewModels::class.java)
        binding.registerBtn.setOnClickListener {

            val email = binding.emailEt.text.toString()
            val password = binding.emailPasswordEt.text.toString()
            val confirmPassword = binding.ConfrimPasswordEt.text.toString()
            if(email.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty()){
                Toast.makeText(this@RegistrationActivity, "Register Success", Toast.LENGTH_SHORT).show()

                viewModel.singUp(email, password)

            }else if (!password.equals(confirmPassword)) {
                Toast.makeText(this@RegistrationActivity, "Password not match", Toast.LENGTH_SHORT).show()
            }
            else{
                viewModel.singUp(email, password).observe(this,{result->
                    Toast.makeText(this@RegistrationActivity, result, Toast.LENGTH_SHORT).show()

                    if(result.equals("Singup Success")){
                        startActivity(Intent(this@RegistrationActivity, HomeActivity::class.java))
                    }
            })
        }
            binding.AlreadyHaveAnAccountTxt.setOnClickListener {
                startActivity(Intent(this@RegistrationActivity, MainActivity::class.java))
            }
        }


    }
}