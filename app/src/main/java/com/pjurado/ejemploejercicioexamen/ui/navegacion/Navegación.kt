package com.pjurado.ejemploejercicioexamen.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pjurado.ejemploejercicioexamen.ui.listaScreen.ListaScreen
import com.pjurado.ejemploejercicioexamen.ui.nuevaTarea.NuevaTarea

@Composable
fun Navegacion() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Lista) {
        // Aquí se definen las rutas de navegación
        composable<Lista> { ListaScreen{
            navController.navigate(AddTarea)
        } }
        composable<AddTarea> { NuevaTarea() }
    }
}