package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic (
    @DrawableRes val imageResource:Int,
    @StringRes val nameResource:Int,
    val topicsCount:Int
)