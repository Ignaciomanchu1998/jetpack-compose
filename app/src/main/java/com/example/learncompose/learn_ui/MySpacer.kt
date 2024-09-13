package com.danis.jetpackcompose.learn_ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MySpacer(modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.height(150.dp))
}