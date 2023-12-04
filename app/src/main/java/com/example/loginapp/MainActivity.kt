package com.example.loginapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.loginapp.Presentation.onBording.components.OnBoardingPage
import com.example.loginapp.Presentation.screens.onBording.OnBoardingScreen
import com.example.loginapp.app.O6bgaApp
import com.example.loginapp.ui.theme.LoginappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            LoginappTheme {
                // A surface container using the 'background' color from the theme
                OnBoardingScreen ()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        fontFamily = FontFamily.Default
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginappTheme {
        Greeting("Android")
    }
}