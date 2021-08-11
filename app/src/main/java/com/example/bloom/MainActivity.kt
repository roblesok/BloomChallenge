package com.example.bloom

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bloom.ui.theme.BloomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BloomApplication()
        }
    }
}

@Composable
fun BloomApplication() {
    BloomTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "Hello Bloom", style = MaterialTheme.typography.h1)
            }
        }
    }
}

@Preview(
    name = "BloomApplication Night",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
    name = "BloomApplication DAY",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Composable
private fun PreviewBloomApplication() {
    BloomApplication()
}