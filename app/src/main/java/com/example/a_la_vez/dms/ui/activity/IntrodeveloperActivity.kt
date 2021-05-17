package com.example.a_la_vez.dms.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.a_la_vez.R
import com.example.a_la_vez.dms.recyclerView.Developer
import com.example.a_la_vez.dms.recyclerView.adapter
import com.example.a_la_vez.dms.recyclerView.list
import com.example.a_la_vez.dms.ui.fragment.MypageFragment
import kotlinx.android.synthetic.main.activity_introdeveloper.*

class IntrodeveloperActivity : AppCompatActivity() {

    val dataArray: ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {

        return_img.setOnClickListener() {
            startActivity(Intent(this, MypageFragment::class.java))
            finish()
        }

        var devList = arrayListOf<Developer>(
                Developer("Android", "이은별", "eunbyul"),
                Developer("Front-end", "강은빈", "eunbeen"),
                Developer("Server", "이주열", "ju"),

                )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introdeveloper)

        val mAdapter = adapter(this, devList)
        Intro_developer_rc.adapter = mAdapter

        val lm = LinearLayout(this)
        Intro_developer_rc.layoutManager
        Intro_developer_rc.setHasFixedSize(true)
    }
}
