package com.example.a_la_vez.dms.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a_la_vez.R
import com.example.a_la_vez.dms.ui.fragment.FavoriteFragment
import com.example.a_la_vez.dms.ui.fragment.HomeFragment
import com.example.a_la_vez.dms.ui.fragment.MypageFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.container, HomeFragment()).commit()
        bottomNavBar.setOnNavigationItemSelectedListener(itemListener)
    }

    private val itemListener = BottomNavigationView.OnNavigationItemSelectedListener {
        when (it.itemId) {
            R.id.home -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.container, HomeFragment()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.menu_favorite -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.container, FavoriteFragment()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.menu_mypage -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.container, MypageFragment()).commit()
                return@OnNavigationItemSelectedListener true
            }
            else -> {
                return@OnNavigationItemSelectedListener false
            }

        }
    }
}