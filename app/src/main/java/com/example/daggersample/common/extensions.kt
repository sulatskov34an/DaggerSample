package com.example.daggersample.common

import android.content.Context
import androidx.swiperefreshlayout.widget.CircularProgressDrawable

fun Context.getProgressBar(): CircularProgressDrawable {
    val circularProgressDrawable = CircularProgressDrawable(this)
    circularProgressDrawable.strokeWidth = 5f
    circularProgressDrawable.centerRadius = 30f
    circularProgressDrawable.start()
    return circularProgressDrawable
}