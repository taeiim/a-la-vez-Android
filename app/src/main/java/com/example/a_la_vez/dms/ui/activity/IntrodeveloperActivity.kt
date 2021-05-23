package com.example.a_la_vez.dms.ui.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a_la_vez.R
import com.example.a_la_vez.dms.recyclerView.Developer
import com.example.a_la_vez.dms.recyclerView.adapter
import com.example.a_la_vez.dms.recyclerView.list
import com.example.a_la_vez.dms.ui.fragment.MypageFragment
import kotlinx.android.synthetic.main.activity_introdeveloper.*
import kotlinx.android.synthetic.main.activity_introdeveloper.view.*
import splitties.activities.start

class IntrodeveloperActivity : AppCompatActivity() {

        var devList = arrayListOf<Developer>(
                Developer("Android", "이은별", "eunbyul"),
                Developer("Frontend", "강은빈", "eunbeen"),
                Developer("Server", "이주열", "ju"),
                )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introdeveloper)

        val mAdapter = adapter(this, devList)
        Intro_developer_rc.adapter = mAdapter

        val lm  = LinearLayoutManager(this)
        Intro_developer_rc.layoutManager = lm
        Intro_developer_rc.setHasFixedSize(true)


        return_img.setOnClickListener(){
            val intent =Intent(this,MypageFragment::class.java)
            finish()
        }
    }
}


