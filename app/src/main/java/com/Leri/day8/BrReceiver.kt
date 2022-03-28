package com.Leri.day8

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.util.Log.i as i1

class BrReceiver: BroadcastReceiver() {
    var ischarging=true


    override fun onReceive(context: Context, intent: Intent) {
        val action = intent.action

        if (intent.action.equals(Intent.ACTION_POWER_CONNECTED)) {
            ischarging=true
            Log.d("INFO", "meFDSFSDssage")
        } else if (intent.action.equals(Intent.ACTION_POWER_DISCONNECTED )) {
            ischarging=false
            Log.d("INFO", "ARAAAAAAmeFDSFSDssage")
        }
    }





}
