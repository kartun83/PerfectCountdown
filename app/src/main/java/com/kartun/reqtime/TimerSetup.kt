package com.kartun.reqtime

import android.app.Activity
import android.os.Bundle
import com.kartun.reqtime.databinding.ActivityTimerSetupBinding

class TimerSetup : Activity() {

    private lateinit var binding: ActivityTimerSetupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTimerSetupBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}