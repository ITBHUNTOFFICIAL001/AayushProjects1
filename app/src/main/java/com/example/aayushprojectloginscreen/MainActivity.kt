package com.example.aayushprojectloginscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aayushprojectloginscreen.ui.theme.AayushProjectLoginscreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally ) {
                Text(
                    text = "LOGIN ", fontSize = 32.sp
                )


                TextField(value = "", onValueChange = {},
                    label={ Text(text = "USERNAME")})
                TextField(value = "", onValueChange = {},
                    label={ Text(text = "PASSWORD")})

                Row() {
                    Text(text = stringResource(id = R.string.new_account), fontSize = 20.sp)

                    Button(onClick = { /*TODO*/ }
                        , border = BorderStroke(1.dp, Color.Red)
                        , shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors())
                    {
                        Text(text = stringResource(id = R.string.signup))

                    }

                }
            }



        }
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
    AayushProjectLoginscreenTheme {
        Greeting("Android")
    }
}