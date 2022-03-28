package com.Leri.day8

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.widget.Toast


class BrReceiver: BroadcastReceiver() {
    var isconnected:Boolean = false


    override fun onReceive(context: Context?, intent: Intent) {

        //val batteryStatus: Intent? = IntentFilter(Intent.ACTION_BATTERY_CHANGED).let { ifilter ->
         //   context?.registerReceiver(null, ifilter) }

        if (intent.action == Intent.ACTION_POWER_CONNECTED) {
            isconnected=true

           Toast.makeText(context, "phone device is charging", Toast.LENGTH_SHORT).show()
        } else if( intent.action == Intent.ACTION_POWER_DISCONNECTED ){
            isconnected=false
            Toast.makeText(context, "phone is not charging", Toast.LENGTH_SHORT).show()
        }
    }




}
