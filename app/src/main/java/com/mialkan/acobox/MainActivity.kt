package com.mialkan.acobox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mialkan.acobox.ui.theme.ACOBoxTheme

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
    ACOBoxTheme {
        Scaffold { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                LazyColumn(
                    state = rememberLazyListState(),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    item {
                        Spacer(modifier = Modifier.height(20.dp))
                    }
                    item {
                        Row(
                            modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Column(modifier = Modifier.background("#F5F5F5".toColor()).weight(1f)) {
                                Text(
                                    modifier = Modifier.padding(start = 18.dp, top = 18.dp),
                                    text = "0",
                                    style = TextStyle.Default.copy(
                                        color = "#002F8C".toColor(),
                                        fontWeight = FontWeight(300),
                                        fontSize = 32.sp
                                    )
                                )
                                Row(
                                    modifier = Modifier.padding(
                                        start = 18.dp,
                                        bottom = 14.dp,
                                        end = 14.dp
                                    ),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
                                    Text(
                                        modifier = Modifier.weight(1f),
                                        text = "Active streak",
                                        style = TextStyle.Default.copy(
                                            color = "#002F8C".toColor(),
                                            fontWeight = FontWeight(400),
                                            fontSize = 12.sp
                                        )
                                    )
                                    Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null, modifier = Modifier.size(33.dp, 33.dp))
                                }
                            }
                            Column(modifier = Modifier.background("#F5F5F5".toColor()).weight(1f)) {
                                Text(
                                    modifier = Modifier.padding(start = 18.dp, top = 18.dp),
                                    text = "78",
                                    style = TextStyle.Default.copy(
                                        color = "#002F8C".toColor(),
                                        fontWeight = FontWeight(300),
                                        fontSize = 32.sp
                                    )
                                )
                                Row(
                                    modifier = Modifier.padding(
                                        start = 18.dp,
                                        bottom = 14.dp,
                                        end = 14.dp
                                    ),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
                                    Text(
                                        modifier = Modifier.weight(1f),
                                        text = "Total entries",
                                        style = TextStyle.Default.copy(
                                            color = "#002F8C".toColor(),
                                            fontWeight = FontWeight(400),
                                            fontSize = 12.sp
                                        )
                                    )
                                    Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null, modifier = Modifier.size(33.dp, 33.dp))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

fun CharSequence.toColor() = Color(android.graphics.Color.parseColor(this.toString()))
