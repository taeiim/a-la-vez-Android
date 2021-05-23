package com.example.a_la_vez.dms.ui.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a_la_vez.R
import com.example.a_la_vez.dms.ui.activity.IntrodeveloperActivity
import com.example.a_la_vez.dms.ui.activity.MainActivity
import io.reactivex.internal.schedulers.SchedulerPoolFactory.start
import kotlinx.android.synthetic.main.fragment_mypage.*

class MypageFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mypage, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        intro_developer_tv.setOnClickListener {
            activity.let {
                val intent = Intent(context,IntrodeveloperActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

