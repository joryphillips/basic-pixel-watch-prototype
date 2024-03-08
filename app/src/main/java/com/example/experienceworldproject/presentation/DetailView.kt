package com.example.experienceworldproject.presentation

import androidx.wear.compose.material.MaterialTheme
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.rememberScrollState
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.layout.ContentScale
import androidx.wear.compose.material.Text


@Composable
fun DetailView(detail: Activity) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp).verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = detail.imagePath),
            contentDescription = "Activity Image",
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = detail.location,
            style = MaterialTheme.typography.title1
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = detail.name,
            style = MaterialTheme.typography.title3
        )
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec laoreet venenatis laoreet. Vivamus sit amet porta enim. Donec risus tortor, maximus ac metus ut, sagittis volutpat nisl. Vivamus eget leo in massa fermentum bibendum. Quisque aliquet blandit leo, eu efficitur ante. Phasellus eros ligula, viverra vel erat vel, luctus convallis mauris. Quisque id tincidunt urna. Nulla vel dui ligula.",
            style = MaterialTheme.typography.body1
        )
    }
}