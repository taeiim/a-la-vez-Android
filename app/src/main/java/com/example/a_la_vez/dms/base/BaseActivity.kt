package com.example.a_la_vez.dms.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a_la_vez.R

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}