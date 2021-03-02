package com.example.androiddevchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.data.DogInfo
import com.example.androiddevchallenge.ui.theme.MyTheme

class DogDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var dogInfo = intent.getSerializableExtra("dogInfo") as DogInfo
        setContent {
            MyTheme {
                DogDetailView(dogInfo = dogInfo)
            }
        }
    }
}

@Composable
fun DogDetailView(dogInfo: DogInfo) {
    Surface(color = MaterialTheme.colors.background) {
            Column(
                Modifier
                    .verticalScroll(ScrollState(0))) {
                Image(
                    painterResource(id = dogInfo.imageId),
                    dogInfo.name,
                    Modifier
                        .fillMaxWidth()
                        .height(300.dp),
                    contentScale = ContentScale.Crop
                )
                Row(Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Column() {
                        Text(text = dogInfo.name, fontSize = 28.sp,color = Color.Magenta,modifier = Modifier.padding(15.dp))
                        Text(text = dogInfo.alias, fontSize = 22.sp, color = Color.Blue,modifier = Modifier.padding(bottom = 15.dp,start = 15.dp,end = 15.dp))
                        Text(text = dogInfo.breed, fontSize = 22.sp, color = Color.Red,modifier = Modifier.padding(bottom = 15.dp,start = 15.dp,end = 15.dp))
                    }
                    Button({},Modifier.padding(top = 15.dp,end = 15.dp)) {
                        Text(text = "领养小狗")
                    }
                }
                Text(text = dogInfo.introduce, fontSize = 22.sp, color = Color.DarkGray,modifier = Modifier.padding(start = 15.dp,end = 15.dp))
            }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun DogDetailPreview() {
    MyTheme {
        DogDetailView(DogInfo())
    }
}