package com.example.cw1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cw1.ui.theme.Cw1Theme

import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Cw1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    val myname = "ZHENYANG QIAN"
//    val myemail = "zhenyang@bu.edu"
//    Text(
//            text = "Name: $myname",
//        modifier = modifier
//    )
//    Text(
//        text = "BU email: $myemail",
//        modifier = modifier
//    )
//}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val myName = "ZHENYANG QIAN"
    val myEmail = "zhenyang@bu.edu"

    var message by remember { mutableStateOf("hajimi") }

    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(text = "Name: $myName")
        Text(text = "BU Email: $myEmail")
        Text(text = message)
        Button(
            onClick = {
                message = if (message == "hajimi") "manbo" else "hajimi"
            }
        ) {
            Text("Change Message")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Cw1Theme {
        Greeting("Android")
    }
}