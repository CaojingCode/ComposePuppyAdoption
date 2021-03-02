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

import com.example.androiddevchallenge.R
import java.io.Serializable

data class DogInfo(
    var name: String = "安琪拉baby", /* 名字 */
    var alias: String = "泰迪",  /* 别名 */
    var breed: String = "贵宾犬", /* 品种 */
    var introduce: String = "最常见的是红色（也叫棕色）中小体型的贵宾犬 除此之外还有黑色、灰色、白色等颜色的贵宾犬 其体型也有茶杯体贵宾至巨型贵宾之分 此类犬是小型犬中智商最高者 性格活泼 且最大的优点就是不会像其他汪星人一样大量掉毛 但也正因为如此 它需要定期理毛修毛", //介绍
    var imageId: Int = R.drawable.ic_launcher_background
) : Serializable

var names = arrayOf("安琪拉baby", "小熊熊", "俊介", "小吉吉", "老爷爷", "巴格达", "小妲己", "柯南")
var alias = arrayOf("泰迪", "比熊", "博美", "苹果头", "小老头，倔老头", "哈巴狗", "迷你杜宾", "名侦探")
var breads = arrayOf("贵宾犬", "比熊犬", "博美犬", "吉娃娃", "雪纳瑞", "巴哥犬", "鹿犬", "柯基")
var introduces = arrayOf(
    "最常见的是红色（也叫棕色）中小体型的贵宾犬 除此之外还有黑色、灰色、白色等颜色的贵宾犬 其体型也有茶杯体贵宾至巨型贵宾之分 此类犬是小型犬中智商最高者 性格活泼 且最大的优点就是不会像其他汪星人一样大量掉毛 但也正因为如此 它需要定期理毛修毛",
    "此类犬通常情况下只有白色一种颜色 常与白色贵宾犬混淆 两者比较容易分辨的一个区别是贵宾犬眼睛是类似于杏仁形状的 而比熊的眼睛是圆形的 它与贵宾犬的属性相似 同样比较聪明 不爱掉毛 需要经常理毛修毛 但性格方面两者相较 比熊会比较憨厚一点 贵宾的性格则偏向于活泼",
    "最出名的博美犬是一只名叫“俊介”的黄色博美 因其可爱的造型被众多网友称赞 现“俊介”除了是一只汪的名字 还是博美这一类汪星人的一种美容造型 除了黄色 常见的博美颜色还有白色 这种犬的毛也是需要经常打理 换毛期的时候 会有掉毛现象 性格方面 比较像一个被宠爱的小公主",
    "世界上体型最小的汪星人就是一只吉娃娃 这种犬体型小 被毛短好打理 性格略有些倔且要强 纯种的吉娃娃头的形状像苹果 称为“苹果头”",
    "此类犬的特点就是像老爷爷一样长着长长的“胡子”且有时性格比较倔强执拗 但平时 它是个活泼、精力充沛的家伙 颜色有黑色、椒盐色、黑银色和白色 最常饲养的体型为标准体型 但也有巨型雪纳瑞和迷你雪纳瑞",
    "毛短易打理 长相特别有特点 皮肤皱皱的 双眼突出 鼻子却又像被人打了一拳一样 看起来憨憨的 蠢蠢的 性格也是如此 吃东西容易收不住 运动量比较大 但因其鼻腔较短 不适合做太过激烈的运动",
    "有人称之为“迷你杜宾”常见颜色为黑红色（有人称之为“铁包金”）和红色 四肢修长 体型匀称 被毛短 随着年龄增长耳朵会渐渐立直 性格机警活泼",
    "英国女王最爱的犬 小短腿 性格友好温顺 聪明善解人意 充满活力（个人觉得这种犬 小短腿的基因特别强大）"
)
var imageIds = arrayOf(
    R.drawable.guibin,
    R.drawable.bixion,
    R.drawable.bomei,
    R.drawable.jiwawa,
    R.drawable.xuenarui,
    R.drawable.bage,
    R.drawable.luquan,
    R.drawable.keji
)

fun getDogs(): List<DogInfo> {
    val list = ArrayList<DogInfo>()
    for (i in names.indices) {
        val dogInfo =
            DogInfo(names[i], alias[i], breads[i], introduces[i], imageIds[i])
        list.add(dogInfo)
    }
    return list
}