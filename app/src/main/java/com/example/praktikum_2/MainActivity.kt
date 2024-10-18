package com.example.praktikum_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum_2.ui.theme.Praktikum_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktikum_2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Halaman(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Halaman(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    )


{

    Spacer(modifier = Modifier.padding(10.dp))
    Text(
        "Login", fontSize = 50.sp,
        fontWeight = FontWeight.Bold)
    )
    Spacer(modifier = Modifier.padding(10.dp))
    Text(
        "Ini Adalah Halaman Login",
        fontSize = 20.sp,
        fontStyle = FontStyle.Italic)
    Spacer(modifier = Modifier.padding(10.dp))
    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Logo UMY",
        modifier = Modifier
            .clip(CircleShape)
            .size(250.dp)

    )
    Spacer(modifier = Modifier.padding(10.dp))
    Text(
        "Nama :",
        fontSize = 20.sp,
        fontStyle = FontStyle.Italic
    )
    Spacer(modifier = Modifier.padding(5.dp))
    Text(
        "Muhammad Faransyah Hamizan",
        fontSize = 20.sp,
        fontStyle = FontStyle.Italic,
        color = Color.Red
    )
    Spacer(modifier = Modifier.padding(5.dp))
    Text(
        "20220140162",
        fontSize = 20.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold
    )



    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Praktikum_2Theme {
        Halaman()
    }
}