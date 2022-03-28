package com.Leri.day8

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class FourthActivity : AppCompatActivity() {
    lateinit var textname:TextView
    lateinit var textage:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        textname=findViewById(R.id.nameview)
        textage=findViewById(R.id.ageview)

        val mPrefs = getSharedPreferences("share", 0)
        val strname = mPrefs.getString("name", "")
        val age = mPrefs.getString("age", "")


        textname.setText("Name: $strname")
       textage.setText("Age: $age")

    }


}