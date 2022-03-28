package com.Leri.day8

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat


class MainActivity : AppCompatActivity() {
    lateinit var btnsave:Button
    lateinit var edittxtname:EditText
    lateinit var edittxtage:EditText
    lateinit var name:String
       var age=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edittxtage=findViewById(R.id.editTextTextAge)
        edittxtname=findViewById(R.id.editTextTextname)
        btnsave=findViewById(R.id.savebtn)
        btnsave.setOnClickListener {
            savebtnclick()
        }
    }

    fun savebtnclick(){
        var strage=edittxtage.text.toString()
        age =Integer(strage).toInt()
        name=edittxtname.text.toString()

        if(age<18){
            showNotification()
        }
        else if(age>=18){

           var sharedPreferences = getSharedPreferences("share", MODE_PRIVATE);
            var editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor?.putString("name",name);
            editor?.putString("age",strage)
            editor!!.commit()



            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }


    }



    private fun showNotification() {
        val notificationManager =
            this.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val notificationId = 1
        val channelId = "channel-01"
        val channelName = "Channel Name"
        val importance = NotificationManager.IMPORTANCE_HIGH
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val mChannel = NotificationChannel(
                channelId, channelName, importance
            )
            notificationManager.createNotificationChannel(mChannel)
        }
        val mBuilder: NotificationCompat.Builder =
            NotificationCompat.Builder(this, channelId)
                .setLargeIcon(
                    BitmapFactory.decodeResource(
                        this.resources,
                        R.drawable.logo
                    )
                )
                .setSmallIcon(R.drawable.logo).setContentTitle("")
                .setContentText("Sory you age is under 18")
        val intent = Intent(this, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(this, 0, intent, 0)
        mBuilder.setContentIntent(pendingIntent)
        notificationManager.notify(notificationId, mBuilder.build())
    }
}