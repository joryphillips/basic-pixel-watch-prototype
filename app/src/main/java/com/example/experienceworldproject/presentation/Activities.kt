package com.example.experienceworldproject.presentation

import com.example.experienceworldproject.R
import java.util.UUID

class ActivitiesRepository {

    private val knownActivities: List<Activity> = listOf(
        Activity(UUID.randomUUID(), "Venice Beach", "Rollerblade", R.drawable.venice),
        Activity(UUID.randomUUID(), "Larchmont Village", "Eat Frozen Yogurt", R.drawable.larchmont),
        Activity(UUID.randomUUID(), "Echo Park", "Live Music", R.drawable.venice)
    )

    fun getActivities(): List<Activity> {
        return knownActivities
    }

    private fun placeholderActivity(): Activity {
        return Activity(UUID.randomUUID(), "Placeholder Location", "Placeholder Activity", R.drawable.placeholder_image)
    }

    fun getList(): List<Activity> {
        val prefixPlaceholders = List(3) { placeholderActivity() }
        val suffixPlaceholders = List(3) { placeholderActivity() }

        return prefixPlaceholders + knownActivities + suffixPlaceholders
    }
}




