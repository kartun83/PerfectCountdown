package com.kartun.reqtime

data class TimerData(
    val name: String,
    val textAfter: String,
    val duration: Int,
    val timeoutAfter: Int,
    var reps: Int,
)
{
    var current: Int = 0
}