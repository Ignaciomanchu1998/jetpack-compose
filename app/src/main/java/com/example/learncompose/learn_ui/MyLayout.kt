package com.danis.jetpackcompose.learn_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyLayout(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {

        // This is Box.
        Box(
            modifier = modifier
                .fillMaxWidth()
                .weight(1f)
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Box")
        }
        MySpacer(modifier = modifier)
        // This is Row.
        Row(
            modifier = modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = Color.Red),
                contentAlignment = Alignment.Center,
            ) {
                Text(text = "Example 2")
            }
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = Color.Blue),
                contentAlignment = Alignment.Center,
            ) {
                Text(text = "Example 3")
            }
        }

        // This is Box.
        Box(
            modifier = modifier
                .fillMaxWidth()
                .weight(1f)
                .background(color = Color.Green),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Example 4")
        }
    }
}