package com.example.androiddevchallenge

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.androiddevchallenge.data.getDogs
import com.example.androiddevchallenge.ui.theme.MyTheme


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp(this)
            }
        }
    }

}

// Start building your app here!
@Composable
fun MyApp(activity: MainActivity) {
    Surface(color = MaterialTheme.colors.background) {
        LazyColumn(content = {
            val list = getDogs()
            itemsIndexed(items = list) { index, item ->
                Column(Modifier.clickable {
                    /* 挑战到详情页面 */
                    Intent(activity, DogDetailActivity::class.java).apply {
                        putExtra("dogInfo", item)
                        activity.startActivity(this)
                    }
                }) {
                    Row(modifier = Modifier.padding(10.dp)) {

                        Image(
                            painterResource(id = item.imageId),
                            item.name,
                            Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(10.dp)),
                            contentScale = ContentScale.Crop
                        )
                        Column(
                            Modifier
                                .padding(start = 20.dp)
                                .height(100.dp), Arrangement.SpaceBetween
                        ) {
                            Text(text = item.name, fontSize = 28.sp)
                            Text(text = item.alias, fontSize = 22.sp, color = Color.DarkGray)
                            Text(text = item.breed, fontSize = 22.sp, color = Color.DarkGray)
                        }

                    }
                    if (index < list.size - 1) {
                        Divider(startIndent = 130.dp)
                    }
                }

            }
        })
    }
}


@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
//        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
//        MyApp()
    }
}