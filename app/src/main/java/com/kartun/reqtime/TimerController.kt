package com.kartun.reqtime

import android.util.Log

class TimerController {
    protected var  mTimerSteps : MutableList<TimerData>
    constructor(){
        mTimerSteps = mutableListOf<TimerData>(
            TimerData("Test #1", "Finished #1", 3, 5, 2),
            TimerData("Test #2", "Finished #2", 2, 4, 1),
            TimerData("Test #3", "Finished #3", 4, 4, 4),
        )
    }

    fun startChain()
    {
        mTimerSteps.listIterator().forEach { Log.d("BBC", it.name)
            for (i in 0 until it.reps)
            {
                Log.d("BBC", "Name: ${it.name} Rep: ${i+1}")
            }
        }
    }


}