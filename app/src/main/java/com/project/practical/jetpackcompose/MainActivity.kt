package com.project.practical.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.practical.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Image(painter = painterResource(
                    id = R.drawable.ic_launcher_foreground),
                    contentDescription ="nothing",
                    modifier = Modifier.height(300.dp).width(300.dp),
                    contentScale = ContentScale.Crop
                )
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "name of item",
                        style = TextStyle(
                            fontSize =26.sp
                        )
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(
                        text = "detail of item",
                        style = TextStyle(
                            fontSize =17.sp
                        )
                        )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(
                        text = "price of item",
                        style = TextStyle(
                            fontSize =17.sp,
                            color = Color(0xFF85bb65)
                        )
                        )

                }
            }

        }
    }
}

