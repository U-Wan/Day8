package com.Leri.day8


import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    lateinit var imggreen:ImageView
    lateinit var imgred:ImageView
    lateinit var btncheckcharging:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        imggreen=findViewById(R.id.greenimg)
        imgred=findViewById(R.id.redimg)
        btncheckcharging=findViewById(R.id.checkchargerbtn)
        btncheckcharging.setOnClickListener {
            checkifcharging()
        }



    }

    private fun checkifcharging() {
        //imggreen.visibility = View.VISIBLE
        //imgred.visibility=View.VISIBLe

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    fun opennewfeature(item: MenuItem) {
        val intent4 = Intent(this, ThirdActivity::class.java)
        startActivity(intent4)

    }
}

