package com.Leri.day8



import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu3, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about -> {
                Toast.makeText(this, "about selected", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, FourthActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.exit-> {
                Toast.makeText(this, "exit selected", Toast.LENGTH_SHORT).show()
                val intent1 = Intent(this, MainActivity::class.java)
                startActivity(intent1)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}