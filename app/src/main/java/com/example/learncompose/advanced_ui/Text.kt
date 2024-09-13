package com.example.learncompose.advanced_ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

@Composable
fun MyText(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "My name is Jetpack Compose"
        )
        Text(text = "This is my text with color", color = Color.Red)
        Text(text = "This is my text with font-weight", fontWeight = FontWeight.Bold)
        Text(
            text = "This is my text with Style",
            style = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontSize = 25.sp,
                textAlign = TextAlign.Center
            )
        )
        Text(
            text = "This is my text with Decoration",
            style = TextStyle(
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.LineThrough
            )
        )
        Text(
            text = "This is my text with Decoration 02",
            style = TextStyle(
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline
            )
        )
        Text(
            text = "This is my text with Combined Decoration",
            style = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.combine(
                    listOf(
                        TextDecoration.LineThrough,
                        TextDecoration.Underline
                    )
                )
            )
        )

    }
}