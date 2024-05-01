package com.eam03.practica_taller.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.eam03.practica_taller.UI.Screens.FirstScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.eam03.practica_taller.UI.Screens.SecondScreen

@Composable
fun AppNav(){

    val navController = rememberNavController()
    NavHost(navController=navController, startDestination = AppScreens.FirstScreen.route) {
        composable(route = AppScreens.FirstScreen.route) {

            FirstScreen(navController)
        }
        composable(route = AppScreens.SecondScreen.route){
            SecondScreen(navController)
        }

    }
}