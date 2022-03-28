package com.Leri.day8



import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso


class ThirdActivity : AppCompatActivity() {
    lateinit var btnsearch:Button
    lateinit var edtlink:EditText
    lateinit var imgview:ImageView
   // var img2="https://images.ctfassets.net/u0haasspfa6q/1uGsqwmSpOUN3ITzZ0akhp/7582e3072d2da76fdc3689527f808268/girl-in-the-sunset-on-some-rocks-on-the-water?w=1920&fm=webp&q=90"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        btnsearch=findViewById(R.id.buttonsrch)
        imgview=findViewById(R.id.imageView)
        edtlink=findViewById(R.id.editextlink)
        var str1=edtlink.text.toString()
        btnsearch.setOnClickListener {

            Picasso.get().load(str1).into(imgview)
        }

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