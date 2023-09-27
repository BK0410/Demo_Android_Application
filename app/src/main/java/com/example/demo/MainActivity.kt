package com.example.demo

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo.ui.theme.DemoTheme
import java.nio.file.Files.size

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(20.dp)){
                        var a by remember {
                            mutableStateOf("")
                        }
                        var b by remember {
                            mutableStateOf("")
                        }
                        Row (horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)){
                            Text(text = "Sign Up", fontWeight = FontWeight.Bold, fontSize = 32.sp)
                            Text (text = "x", fontSize = 24.sp)
                        }
                        Text(text = "It's quick and easy", textAlign = TextAlign.Start, modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 5.dp))
                        Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(5.dp))
                        Row (horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)){
                            TextField(value = a, onValueChange = {a = it}, Modifier.width(170.dp),placeholder = { Text(text = "First Name")})
                            TextField(value = b, onValueChange = {b = it}, Modifier.width(170.dp),placeholder = { Text(text = "Last Name")})
                        }
                        TextField(value = a, onValueChange = {a = it},
                            Modifier
                                .padding(5.dp)
                                .fillMaxWidth(),placeholder = { Text(text = "Mobile Number or Email address")})
                        TextField(value = a, onValueChange = {a = it}, Modifier
                            .padding(5.dp)
                            .fillMaxWidth(), placeholder = { Text(text = "Password")})
                        Text(text = "People who use our service may have uploaded your contact information to facebook. Learn More.")
                        Button(onClick = { }, shape = RoundedCornerShape(5.dp),colors = ButtonDefaults.buttonColors(
                            Color(0xFF5BB940)
                        ), modifier = Modifier
                            .width(150.dp)) {
                            Text(text = "Sign Up", fontWeight = FontWeight.Bold)
                        }
                    }

                }
            }
        }
    }
}