package com.example.mvvm1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm1.view.*


@Composable
fun AppNavigation() {
    val navigationController = rememberNavController()
    NavHost(navController = navigationController, startDestination = AppScreens.MenuInicio.ruta)

    {
        //composable(AppScreens.MenuInicio.ruta) { MenuInicio(navigationController) }
        //composable(AppScreens.GuardarDatos.ruta) { GuardarDatos(navigationController) }

    }
}