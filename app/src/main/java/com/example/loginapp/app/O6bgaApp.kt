package com.example.loginapp.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.loginapp.screens.SignUpScreen

@Composable
fun O6bgaApp() {
    Surface (
        modifier = Modifier.fillMaxSize(),
            color = Color.White
    ){
        SignUpScreen()
    }
}