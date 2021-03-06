/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.data.DogInfo
import com.example.androiddevchallenge.ui.theme.MyTheme

class DogDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dogInfo = intent.getSerializableExtra("dogInfo") as DogInfo
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
                .verticalScroll(ScrollState(0))
        ) {
            Image(
                painterResource(id = dogInfo.imageId),
                dogInfo.name,
                Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                contentScale = ContentScale.Crop
            )
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = dogInfo.name,
                        fontSize = 28.sp,
                        color = Color.Magenta,
                        modifier = Modifier.padding(15.dp)
                    )
                    Text(
                        text = dogInfo.alias,
                        fontSize = 22.sp,
                        color = Color.Blue,
                        modifier = Modifier.padding(bottom = 15.dp, start = 15.dp, end = 15.dp)
                    )
                    Text(
                        text = dogInfo.breed,
                        fontSize = 22.sp,
                        color = Color.Red,
                        modifier = Modifier.padding(bottom = 15.dp, start = 15.dp, end = 15.dp)
                    )
                }
                Button({}, Modifier.padding(top = 15.dp, end = 15.dp)) {
                    Text(text = "领养小狗")
                }
            }
            Text(
                text = dogInfo.introduce,
                fontSize = 22.sp,
                color = Color.DarkGray,
                modifier = Modifier.padding(start = 15.dp, end = 15.dp)
            )
        }
    }
}
