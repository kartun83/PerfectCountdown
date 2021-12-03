package com.kartun.reqtime

import android.app.Activity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import com.kartun.reqtime.databinding.ActivityMainBinding
import java.util.*


class MainActivity() : Activity() {

    private lateinit var binding: ActivityMainBinding
    private var mTimer : TimerData = TimerData("Test", "Finished", 3, 10, 1) //counter: Int = 30
    private var reps: Int = 3
    private var timerRunning: Boolean = false
    private lateinit var mTimerController : TimerController

    private var lTimer: CountDownTimer = object : CountDownTimer( mTimer.duration.toLong() * 1000, 1000) {
        // override object functions here, do it quicker by setting cursor on object, then type alt + enter ; implement members

        override fun onTick(millisUntilFinished: Long) {
//            TODO("Not yet implemented")
//            mTimer.current--
            val counterMain: TextView = findViewById(R.id.counterMain)
            counterMain.text = "${millisUntilFinished / 1000}"
        }

        override fun onFinish() {
            val counterMain: TextView = findViewById(R.id.counterMain)
            "${mTimer.textAfter} ${mTimer.timeoutAfter}".also { counterMain.text = it }

        }
        fun setControl(control: TextView)
        {

        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val counterMain: TextView = findViewById(R.id.counterMain)
        val headerMain: TextView  = findViewById(R.id.headerText)

        mTimerController = TimerController()

         counterMain.setOnClickListener {
             this.mTimerController.startChain()
             if (timerRunning)
            {
                lTimer.cancel()
                headerMain.text = "None"
            }
            else
            {
                mTimer.current = mTimer.duration
                lTimer.start()
                headerMain.text = "${mTimer.duration} * ${reps}"

            }
            timerRunning =! timerRunning
        }
    }
    fun updateTimerText(control: TextView )
    {

    }


}