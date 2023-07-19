package com.jamirodev.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jamirodev.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Presentation()
                }
            }
        }
    }
}

@Composable
fun Presentation() {
    PresentationCompose(
        imagePainter = painterResource(R.drawable.android_logo),
        title = "Jamiro Manriquez",
        subtitle = "Android Developer",
        number = "+154(23)45267890",
        email = "jamiro.devops@gmail.com",
        media = "@socialmedia"
    )
}

@Composable
private fun PresentationCompose(
    imagePainter: Painter,
    title: String,
    subtitle: String,
    number: String,
    email: String,
    media: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF283149))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = imagePainter,
                contentDescription = null,
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth()
            )
            Text(
                text = title,
                fontWeight = FontWeight.Light,
                color = Color(0xFFF5F5F5),
                fontSize = 30.sp,
                modifier = Modifier
                    .padding(top = 5.dp, bottom = 1.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center
            )
            Text(
                text = subtitle,
                fontWeight = FontWeight.Bold,
                color = Color(0XFF3ddc84),
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(top = 5.dp, bottom = 2.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 40.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = number,
                fontWeight = FontWeight.Light,
                color = Color(0xFFF5F5F5),
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(top = 5.dp, bottom = 2.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center
            )
            Text(
                text = media,
                fontWeight = FontWeight.Light,
                color = Color(0xFFF5F5F5),
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(top = 5.dp, bottom = 2.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center
            )
            Text(
                text = email,
                fontWeight = FontWeight.Light,
                color = Color(0xFFF5F5F5),
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(top = 5.dp, bottom = 2.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Presentation()
    }
}