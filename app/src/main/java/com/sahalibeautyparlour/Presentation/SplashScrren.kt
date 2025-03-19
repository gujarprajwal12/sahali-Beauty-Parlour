package com.sahalibeautyparlour.Presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sahalibeautyparlour.R



import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavController) {
    // Navigate to Home after 3 seconds
    LaunchedEffect(Unit) {
        delay(3000)
        navController.navigate("home") {
            popUpTo("splash") { inclusive = true }
        }
    }

    // UI Layout
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground), // Ensure it's PNG, JPG, or VectorDrawable
            contentDescription = "App Logo",
            modifier = Modifier.size(150.dp)
        )
    }
}
