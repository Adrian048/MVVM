package com.example.mvvm1.navigation

// CREAMOS UNA SEALED CLASS PARA CONTENER LOS OBJETOS DE CADA RUTA
sealed class AppScreens(val ruta: String){
    object MenuInicio: AppScreens("MenuInicio")
    object GuardarDatos: AppScreens("GuardarDatos")
    }
