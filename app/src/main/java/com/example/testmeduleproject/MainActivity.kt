package com.example.testmeduleproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mylibrary.SDKActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvTest = findViewById<Button>(R.id.tvTest)
        tvTest.setOnClickListener {
            startActivity(Intent(this, SDKActivity::class.java))
        }
    }
}