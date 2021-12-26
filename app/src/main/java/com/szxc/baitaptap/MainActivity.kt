package com.szxc.baitaptap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var from = findViewById<EditText>(R.id.from)
        var to = findViewById<EditText>(R.id.to)
        var cc = findViewById<EditText>(R.id.cc)
        var bcc = findViewById<EditText>(R.id.bcc)
        var sub = findViewById<EditText>(R.id.sub)
        var ce = findViewById<EditText>(R.id.ce)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener() {
            var intent: Intent = Intent(this, MainActivity2::class.java)
            var fr = from.text.toString()
            var To = to.text.toString()
            var Cc = cc.text.toString()
            var bCc = bcc.text.toString()
            var sUb = sub.text.toString()
            var Ce = ce.text.toString()
            intent.putExtra("dulieu1", fr)
            intent.putExtra("dulieu2", To)
            intent.putExtra("dulieu3", Cc)
            intent.putExtra("dulieu4", bCc)
            intent.putExtra("dulieu5", sUb)
            intent.putExtra("dulieu6", Ce)
            startActivity(intent)
        }
    }
}