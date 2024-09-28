package com.example.naeemnoma.firebaseauthentication.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth

class AuthViewModels: ViewModel() {

    private val auth = FirebaseAuth.getInstance()

    fun singUp(email: String,password: String): LiveData<String>{

        val result = MutableLiveData<String>()
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if(it.isSuccessful){
                    result.value = "SingUp Success"
                }else{
                    result.value = it.exception?.message
                }
            }

      return result

    }

    fun singIn(email: String,password: String): LiveData<String>{


        val result = MutableLiveData<String>()
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if(it.isSuccessful){
                    result.value = "SingIn Success"
                }else{
                    result.value = it.exception?.message
                }
            }

        return result


    }

    fun singOut(){
        auth.signOut()
    }

}

