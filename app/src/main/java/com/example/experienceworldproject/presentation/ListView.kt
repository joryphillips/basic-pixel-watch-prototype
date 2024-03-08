package com.example.experienceworldproject.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.material.Text
import androidx.wear.compose.foundation.lazy.AutoCenteringParams
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.items
import java.util.UUID

@Composable
fun ListView(activities: List<Activity>, onActivityClick: (id: UUID)->Unit) {
    val listState = rememberScalingLazyListState()

    ScalingLazyColumn(
        modifier = Modifier.fillMaxSize(),
        autoCentering = AutoCenteringParams(itemIndex = 0),
        state = listState,
    ) {
        items(activities) { activity: Activity ->
            ListItemView(activity, onActivityClick)
        }
    }
}


@Composable
fun ListItemView(activity: Activity, onActivityClick: (id: UUID)->Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { onActivityClick(activity.id) },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Text(
                text = activity.location,
                style = TextStyle(fontSize = 20.sp)
            )
            Text(
                text = activity.name,
                style = TextStyle(fontSize = 14.sp)
            )
        }
    }
}