package com.rovaniemii.designsystem

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp

private val NanumGothicExtraBold = FontFamily(Font(resId = R.font.nanum_gothic_extra_bold))
private val NanumGothicBold = FontFamily(Font(resId = R.font.nanum_gothic_bold))
private val NanumGothic = FontFamily(Font(resId = R.font.nanum_gothic))
private val NanumGothicLight = FontFamily(Font(resId = R.font.nanum_gothic_light))

val Header = TextStyle(
    fontFamily = NanumGothicExtraBold,
    fontSize = 28.sp,
)

val Title = TextStyle(
    fontFamily = NanumGothicBold,
    fontSize = 20.sp,
)

val Body = TextStyle(
    fontFamily = NanumGothic,
    fontSize = 14.sp,
)

val BodyLite = TextStyle(
    fontFamily = NanumGothicLight,
    fontSize = 12.sp,
)