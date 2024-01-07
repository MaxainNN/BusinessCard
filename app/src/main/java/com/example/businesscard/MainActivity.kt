package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
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

@Composable
fun Card() {
    Column(
        modifier = Modifier
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(id = R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.padding(10.dp),
            contentScale = ContentScale.Fit,
            alpha = 0.8f
        )
        Text(
            text = stringResource(R.string.full_name),
            modifier = Modifier.padding(bottom = 24.dp),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3ddc84)
        )
        Text(
            text = stringResource(R.string.title),
            fontSize = 24.sp,
            color = Color(0xFF3ddc84)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Rounded.Call,
                contentDescription = "Phone",
                tint = Color(0xFF3ddc84)
            )
            Text(
                text = stringResource(R.string.phone),
                modifier = Modifier.padding(10.dp),
                fontSize = 24.sp,
                color = Color(0xFF3ddc84)
            )

        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Rounded.Share,
                contentDescription = "Social",
                modifier = Modifier.padding(10.dp),
                tint = Color(0xFF3ddc84)
            )
            Text(
                text = stringResource(R.string.social),
                modifier = Modifier.padding(bottom = 10.dp),
                fontSize = 24.sp,
                color = Color(0xFF3ddc84)
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = "Mail",
                modifier = Modifier.padding(10.dp),
                tint = Color(0xFF3ddc84)
            )
            Text(
                text = stringResource(R.string.email),
                modifier = Modifier.padding(bottom = 20.dp),
                fontSize = 24.sp,
                color = Color(0xFF3ddc84)
            )
        }
//        Text(
//            text = stringResource(R.string.phone),
//            modifier = Modifier.padding(10.dp),
//            fontSize = 24.sp,
//            color = Color(0xFF3ddc84)
//        )
//        Text(
//            text = stringResource(R.string.social),
//            modifier = Modifier.padding(bottom = 10.dp),
//            fontSize = 24.sp,
//            color = Color(0xFF3ddc84)
//        )
//        Text(
//            text = stringResource(R.string.email),
//            modifier = Modifier.padding(bottom = 20.dp),
//            fontSize = 24.sp,
//            color = Color(0xFF3ddc84)
//        )
//        Icon(
//            imageVector = Icons.Rounded.Call,
//            contentDescription = "Phone",
//            tint = Color(0xFF3ddc84)
//        )
//        Icon(
//            imageVector = Icons.Rounded.Share,
//            contentDescription = "Social",
//            tint = Color(0xFF3ddc84)
//        )
//        Icon(
//            imageVector = Icons.Rounded.Email,
//            contentDescription = "Mail",
//            tint = Color(0xFF3ddc84)
//        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFc0d0d1)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        //Greeting("Android")
        Card()
    }
}