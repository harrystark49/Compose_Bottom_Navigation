package com.example.compose_bottom_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Settngs(){
    Row(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green),
    horizontalArrangement = Arrangement.Center,
    verticalAlignment = Alignment.CenterVertically,
    ){
        Text(text = "Settings")
    }
}

@Preview(showBackground = true)
@Composable
fun Settings1(){
    Settngs()
}