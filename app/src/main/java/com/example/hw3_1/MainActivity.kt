package com.example.hw3_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.hw3_1.ui.theme.HW3_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HW3_1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AssignmentLayout(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun AssignmentLayout(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .weight(1f, fill = true)
                .fillMaxHeight()
                .background(Color(0xFFC8E6C9)),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "25%", color = Color.Black)
        }

        Box(
            modifier = Modifier
                .weight(3f, fill = true)   // 75%
                .fillMaxHeight()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Box(
                    modifier = Modifier
                        .weight(2f, fill = true)
                        .fillMaxWidth()
                        .background(Color(0xFFEF9A9A)), // 绿
                    contentAlignment = Alignment.Center
                ) {
                    Text("2", color = Color.Black)
                }
                Box(
                    modifier = Modifier
                        .weight(3f, fill = true)
                        .fillMaxWidth()
                        .background(Color(0xFFFFF59D)), // 红
                    contentAlignment = Alignment.Center
                ) {
                    Text("3", color = Color.Black)
                }
                Box(
                    modifier = Modifier
                        .weight(5f, fill = true)
                        .fillMaxWidth()
                        .background(Color(0xFF90CAF9)), // 紫
                    contentAlignment = Alignment.Center
                ) {
                    Text("5", color = Color.Black)
                }
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun AssignmentLayoutPreview() {
    HW3_1Theme {
        AssignmentLayout(modifier = Modifier.fillMaxSize())
    }
}
