package com.szxc.baitaptap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var button2 = findViewById<Button>(R.id.back2)
        var bundle: Bundle? = intent.extras
        var fro = bundle!!.getString("dulieu1")
        var tO = bundle!!.getString("dulieu2")
        var cC= bundle!!.getString("dulieu3")
        var bCC = bundle!!.getString("dulieu4")
        var sUB = bundle!!.getString("dulieu5")
        var cE = bundle!!.getString("dulieu6")
        var sub3 = findViewById<TextView>(R.id.sub2)
        var ten3 = findViewById<TextView>(R.id.ten)
        var em = findViewById<TextView>(R.id.email)
        var ce3 = findViewById<TextView>(R.id.ce2)
        var avt2 = findViewById<TextView>(R.id.avt)
        var ae = fro?.split("")
        avt2.text = ae!![1]
        sub3.text = sUB
        ten3.text = fro
        em.text = "To " +tO
        ce3.text = cE
        button2.setOnClickListener() {
            var intent2: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent2)
            finish()
        }
    }
}