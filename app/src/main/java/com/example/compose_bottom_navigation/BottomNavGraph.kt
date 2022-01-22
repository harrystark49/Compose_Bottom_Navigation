package com.example.compose_bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BOttomNavGraph(navController:NavHostController){
    NavHost(navController = navController,
        startDestination =BottomBarScreen.Home.route
        ){
        composable(BottomBarScreen.Home.route){ Home()}
        composable(BottomBarScreen.Profile.route){ Profile()}
        composable(BottomBarScreen.Settings.route){ Settngs()}
    }
}