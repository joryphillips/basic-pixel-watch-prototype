package com.example.experienceworldproject.presentation

import java.util.UUID

data class Activity(
    val id: UUID,
    val location: String,
    val name: String,
    val imagePath: Int
)