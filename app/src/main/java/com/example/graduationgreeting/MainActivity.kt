package com.example.graduationgreeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
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
                        from = getString(R.string.from_febryand),
                        pesan = "Congrats, hope you will get the job you wanted as soon as possible:D"
                    )
                }
            }
        }
    }
}



@Composable
fun GreetingText(message : String, from : String, pesan : String, modifier : Modifier = Modifier) {

    Image(
        painter = painterResource(id = R.drawable.bg_nijuusei2_conflict),
        contentDescription = "",
        contentScale = ContentScale.Crop
    )
    Column (

        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ){
        Text(
            text = message,
            fontSize = 65.sp,
            fontFamily = FontFamily.Serif,
            lineHeight = 90.sp,
            textAlign = TextAlign.Center,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.White,
                    offset = Offset(x = 5.0f, y = 10.0f),
                    blurRadius = 1.0f
                )
            )
        )

        Text(
            text = pesan,
            fontSize = 25.sp,
            textAlign = TextAlign.Justify,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.White,
                    offset = Offset(x = 5.0f, y = 4.0f),
                    blurRadius = 5.0f
                )
            )
        )

        Text(
            text = from,
            fontFamily = FontFamily.Cursive,
            fontSize = 28.sp,
            fontStyle = FontStyle.Italic,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.White,
                    offset = Offset(x = 5.0f, y = 10.0f),
                    blurRadius = 20.0f
                )
            ),
            modifier = modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true, device = "id:Nexus One", showSystemUi = true)
@Composable
fun GreetingPreview() {
    GreetingText(
        message = "Happy Graduation Anne!",
        from = "From Febryand",
        pesan = "Congrats, hope you will get the job you wanted as soon as possible:D"
    )
}