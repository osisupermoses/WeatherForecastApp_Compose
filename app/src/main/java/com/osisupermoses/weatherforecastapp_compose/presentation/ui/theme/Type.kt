package com.osisupermoses.weatherforecastapp_compose.presentation.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.osisupermoses.weatherforecastapp_compose.R

val DMSans =  FontFamily(
    Font(R.font.dm_sans_regular, FontWeight.Normal),
    Font(R.font.dm_sans_medium, FontWeight.Medium),
    Font(R.font.dm_sans_bold, FontWeight.Bold),
)

val Inter = FontFamily(
    Font(R.font.inter_extra_bold, FontWeight.ExtraBold),
    Font(R.font.inter_bold, FontWeight.Bold),
    Font(R.font.inter_semi_bold, FontWeight.SemiBold),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_regular, FontWeight.Normal),
    Font(R.font.inter_thin, FontWeight.Thin),
    Font(R.font.inter_light, FontWeight.Light),
    Font(R.font.inter_extra_light, FontWeight.ExtraLight),
    Font(R.font.inter_black, FontWeight.Black)
)

// Set of Material typography styles to start with
val DMSansTypography = Typography(
    h1 = TextStyle(
        fontFamily = DMSans,
        fontSize = 154.33.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 200.93.sp,
        letterSpacing = 0.05.em,
        color = Color.White
    ),
    h2 = TextStyle(
        fontFamily = DMSans,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 28.64.sp,
        letterSpacing = 0.05.em,
        color = Color(0xff000000)
    ),
    h3 = TextStyle(
        fontFamily = DMSans,
        fontSize = 24.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 31.25.sp,
        letterSpacing = 0.05.em
    ),
    h4 = TextStyle(
        fontFamily = Inter,
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 19.22.sp,
        color = Color.White
    ),
    h5 = TextStyle(
        fontFamily = DMSans,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 20.83.sp,
        letterSpacing = 0.05.em,
        color = Color.White
    ),
    h6 = TextStyle(
        fontFamily = DMSans,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp,
        color = Color.White
    ),
    subtitle1 = TextStyle(
        fontFamily = Inter,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 19.22.sp,
        color = Color(0xff000000)
    ),
    subtitle2 = TextStyle(
        fontFamily = Inter,
        fontSize = 11.21.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 19.22.sp,
        color = Color.White
    ),
    body1 = TextStyle(
        fontFamily = DMSans,
        fontSize = 15.68.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 20.42.sp,
        color = Color(0xff000000)
    ),
    body2 = TextStyle(
        fontFamily = DMSans,
        fontSize = 12.82.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 16.69.sp,
        color = Color(0xff000000)
    ),
//    button = TextStyle(
//        fontFamily = Poppins,
//        fontSize = 14.sp,
//        fontWeight = FontWeight.SemiBold,
//        lineHeight = 16.sp,
//        letterSpacing = 1.25.sp
//    ),
    caption = TextStyle(
        fontFamily = Inter,
        fontSize = 10.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 19.22.sp,
    ),
    overline = TextStyle(
        fontFamily = DMSans,
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 15.62.sp,
        letterSpacing = 0.05.em
    )
)