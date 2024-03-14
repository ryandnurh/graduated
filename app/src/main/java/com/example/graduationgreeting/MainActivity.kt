package com.example.graduationgreeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.graduationgreeting.ui.theme.GraduationGreetingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GraduationGreetingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        message = "Happy Graduation Anne!",
                        from = "From Febryand",
                        pesan = "Congrats, hope you will get the job you wanted as soon as possible:D"
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message : String, from : String, pesan : String, modifier : Modifier = Modifier) {
    Column (

        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ){
        Text(
            text = message,
            fontSize = 75.sp,
            lineHeight = 90.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = pesan,
            fontSize = 25.sp,
            textAlign = TextAlign.Justify
            )

        Text(
            text = from,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            modifier = modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingText(
        message = "Happy Graduation Anne!",
        from = "From Febryand",
        pesan = "Congrats, hope you will get the job you wanted as soon as possible:D"
    )
}