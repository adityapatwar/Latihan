package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_latihan1.setOnClickListener {
            var pindah: Intent = Intent(applicationContext,Latihan1::class.java)
            startActivity(pindah)
            finish();
            //
        }
        btn_latihan2.setOnClickListener {
            var pindah: Intent = Intent(applicationContext,Latihan2::class.java)
            startActivity(pindah)
            finish();
        }
        btn_latihan3.setOnClickListener {
            var pindah: Intent = Intent(applicationContext,Latihan3::class.java)
            startActivity(pindah)
            finish();
        }

    }
}
