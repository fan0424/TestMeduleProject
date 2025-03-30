package com.example.mylibrary

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SDKActivity : AppCompatActivity() {

    var num = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sdk_activity_sdk)

        val btnGetVersion = findViewById<Button>(R.id.btnGetVersion)
        val btnCalc = findViewById<Button>(R.id.btnCalc)
        val tvVersion = findViewById<TextView>(R.id.tvVersion)
        val tvCalcResult = findViewById<TextView>(R.id.tvCalcResult)

        btnGetVersion.setOnClickListener {
            tvVersion.setText(FanUtils.getVersion())
        }

        btnCalc.setOnClickListener {
            val oldValue = num
            num++
            tvCalcResult.setText("${FanUtils.onCalcSum(oldValue, num)}")
        }
    }

}