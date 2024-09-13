package com.danis.jetpackcompose.learn_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Text(text = "Example A", modifier = Modifier.background(color = Color.Red))
        Text(text = "Example B", modifier = Modifier.background(color = Color.Green))
        Text(text = "Example C", modifier = Modifier.background(color = Color.Blue))
        Text(text = "Example D", modifier = Modifier.background(color = Color.Yellow))
        Text(text = "Example E", modifier = Modifier.background(color = Color.Magenta))
        Text(text = "Example F", modifier = Modifier.background(color = Color.Cyan))
    }
}