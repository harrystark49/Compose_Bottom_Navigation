package com.example.compose_bottom_navigation

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen(){
    var navController= rememberNavController()
    Scaffold(
        bottomBar = {
            BottomBar(navController = navController)
        }
    ) {
        BOttomNavGraph(navController = navController)
    }
}
@Composable
fun BottomBar(navController:NavHostController){
 var Screens= listOf(
     BottomBarScreen.Home,
     BottomBarScreen.Profile,
     BottomBarScreen.Settings
 )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    var currentDestination = navBackStackEntry?.destination
    
    BottomNavigation() {
        Screens.forEach {
            AddItem(Screen = it, currentDestination = currentDestination, navController = navController)
        }
    }
}

@Composable
fun RowScope.AddItem(
    Screen:BottomBarScreen,
    currentDestination:NavDestination?,
    navController:NavHostController
){
    BottomNavigationItem(
        label = {
            Text(text = Screen.title)
        },
        icon = {
            Icon(imageVector = Screen.Icon, contentDescription ="nav" )
        },
        selected = currentDestination?.hierarchy?.any {
            it.route==Screen.route
        } ==true,
        onClick = {
            navController.navigate(Screen.route){
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop=true
            }
        },
        //for unselected item visivily
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled)
    )
}