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
package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R
import java.io.Serializable

data class DogInfo(
    val name: String = "安琪拉baby", /* 名字 */
    val alias: String = "泰迪", /* 别名 */
    val breed: String = "贵宾犬", /* 品种 */
    val introduce: String = "最常见的是红色（也叫棕色）中小体型的贵宾犬 除此之外还有黑色、灰色、白色等颜色的贵宾犬 其体型也有茶杯体贵宾至巨型贵宾之分 此类犬是小型犬中智商最高者 性格活泼 且最大的优点就是不会像其他汪星人一样大量掉毛 但也正因为如此 它需要定期理毛修毛", /* 介绍 */
    @DrawableRes var imageId: Int = R.drawable.ic_launcher_background
) : Serializable
