package com.mialkan.acobox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxScreen()
        }
    }
}

@Composable
fun BoxScreen() {
    Row(
        modifier = Modifier.padding(20.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Column(modifier = Modifier.background(Color.LightGray).padding(10.dp).weight(1f)) {
            Text(
                modifier = Modifier,
                text = "0"
            )
            Text(
                text = "Active streak"
            )
        }
        Column(modifier = Modifier.background(Color.LightGray).padding(10.dp).weight(1f)) {
            Text(
                text = "78"
            )
            Text(
                text = "Total entries"
            )
        }
    }
}
