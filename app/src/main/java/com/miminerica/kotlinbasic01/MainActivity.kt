package com.miminerica.kotlinbasic01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {
            Log.d("메인화면로그","클릭 버튼 눌림")


        }

        smallBtn.setOnClickListener {
            Toast.makeText(this, "작은버튼이 눌렸다", Toast.LENGTH_SHORT).show()
        }



    }
}