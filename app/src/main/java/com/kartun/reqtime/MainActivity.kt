package com.kartun.reqtime

import android.app.Activity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Debug
import android.widget.TextView
import com.kartun.reqtime.databinding.ActivityMainBinding
import java.util.*
import kotlin.concurrent.timer
import android.util.Log

class MainActivity() : Activity() {

    private lateinit var binding: ActivityMainBinding
    private var counter: Int = 30
    private var current : Int = counter
    private var reps: Int = 3
    private var timerRunning: Boolean = false

    private var lTimer: CountDownTimer = object : CountDownTimer(30000, 1000) {
        // override object functions here, do it quicker by setting cursor on object, then type alt + enter ; implement members

        override fun onTick(millisUntilFinished: Long) {
//            TODO("Not yet implemented")
            current--
            //conso
            Log.d("Test tick", current.toString())
            val counterMain: TextView = findViewById(R.id.counterMain)
            counterMain.text = "${current}"
        }

        override fun onFinish() { }
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

        //current.apply { counterMain.text = "test $current" }

         counterMain.setOnClickListener {
             Log.d("main click", current.toString())
             Log.d("main click",timerRunning.toString())
            //counterMain.text = "${counter}"
            if (timerRunning)
            {
                lTimer.cancel()
                headerMain.text = "${counter} * ${reps}"
            }
            else
            {
                lTimer.start()
                headerMain.text = "None";
            }
            timerRunning =! timerRunning
        }
    }
    fun updateTimerText(control: TextView )
    {

    }


}