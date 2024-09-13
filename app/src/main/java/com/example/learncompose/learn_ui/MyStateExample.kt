package com.danis.jetpackcompose.learn_ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyStateExample(modifier: Modifier = Modifier) {
    val counter = rememberSaveable {
        mutableIntStateOf(0)
    }

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { counter.intValue += 1 },
            modifier = modifier
                .height(60.dp)
                .width(300.dp)
        ) {
            Text(
                text = "Click me"
            )
        }

        Text(text = "He sido clickeado ${counter.intValue} veces")

        TextField(value = "", onValueChange = {})

        Text(text = "This is OutlinedTextField")
        OutlinedTextField(
            value = "",
            label = {
                Text(text = "Email")
            },
            onValueChange = {},
            placeholder = {
                Text(text = "example@gmail.com")
            },
            keyboardActions = KeyboardActions {
            },
            shape = RoundedCornerShape(20.dp)
        )
    }
}