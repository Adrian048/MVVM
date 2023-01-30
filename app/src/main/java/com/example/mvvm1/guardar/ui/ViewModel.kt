package com.example.mvvm1.guardar.ui

import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class  ViewModel:ViewModel() {

    private val _id = MutableLiveData<String>()
    val id : LiveData<String> = _id

    private val _nombre = MutableLiveData<String>()
    val nombre : LiveData<String> = _nombre

    private val _isButtonEnable =MutableLiveData<Boolean>()
    val isButtonEnable: LiveData<Boolean> = _isButtonEnable

    fun onCompletedFields(id:String, nombre:String) {
        _id.value = id
        _nombre.value = nombre
        _isButtonEnable.value = enableButton(id, nombre)
    }

    fun enableButton(id:String, nombre:String) =
        //Patterns.EMAIL_ADDRESS.matcher(mail).matches()
        id.length >0 && nombre.length >0
}