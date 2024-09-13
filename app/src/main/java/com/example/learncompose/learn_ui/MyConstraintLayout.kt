package com.danis.jetpackcompose.learn_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyConstraintLayout(modifier: Modifier = Modifier) {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxYellow, boxMagenta, boxCyan, boxBlack, boxGreen) = createRefs()

        Box(
            modifier = modifier
                .size(125.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                })

        Box(
            modifier = modifier
                .size(125.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    bottom.linkTo(boxRed.top)
                    end.linkTo(boxRed.start)
                })

        Box(
            modifier = modifier
                .size(125.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    bottom.linkTo(boxRed.top)
                    start.linkTo(boxRed.end)
                })

        // Add new constraints here
        Box(modifier = modifier
            .size(125.dp)
            .background(Color.Magenta)
            .constrainAs(boxMagenta) {
                top.linkTo(boxRed.bottom)
                end.linkTo(boxRed.start)
            })

        // Add new constraints here
        Box(modifier = modifier
            .size(125.dp)
            .background(Color.Cyan)
            .constrainAs(boxCyan) {
                top.linkTo(boxRed.bottom)
                start.linkTo(boxRed.end)
            })

        // Add new constraints here
        Box(modifier = modifier
            .size(125.dp)
            .background(Color.Black).constrainAs(boxBlack){
                top.linkTo(boxMagenta.bottom)
                start.linkTo(boxMagenta.end)
            })

        // Add new constraints here
        Box(modifier = modifier
            .size(125.dp)
            .background(Color.Green).constrainAs(boxGreen) {
                bottom.linkTo(boxBlue.top)
                start.linkTo(boxBlue.end)
            })
    }
}
