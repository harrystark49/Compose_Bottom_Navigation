package com.example.compose_bottom_navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(var route: String, var title: String, var Icon: ImageVector) {
    object Home:BottomBarScreen("Home","Home",Icons.Default.Home)
    object Profile:BottomBarScreen("Profile","Profile",Icons.Default.Person)
    object Settings:BottomBarScreen("Settings","Settings",Icons.Default.Settings)
}