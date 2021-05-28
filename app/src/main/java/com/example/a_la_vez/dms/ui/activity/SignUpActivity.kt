package com.example.a_la_vez.dms.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a_la_vez.R
import com.example.a_la_vez.dms.API.ApiClient
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlinx.android.synthetic.main.activity_sign_up.email_et
import kotlinx.android.synthetic.main.activity_sign_up.login_btn
import retrofit2.Retrofit
import splitties.activities.start

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        login_btn.setOnClickListener() {
            sign()
        }
    }

    private fun sign() {

        //sucessful
        if (nickname_et.length() > 3 && nickname_et.length() < 8 || password_signup_et.length() < 10) {

            if (password_signup_et == repassword_et) {
                Toast.makeText(this, "회원가입에 성공하였습니다", Toast.LENGTH_SHORT)
                doSignUp(nickname_et.toString(), email_et.toString(), password_signup_et.toString(), repassword_et.toString())
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else falseid_tv.visibility


        } else {
            Toast.makeText(this, "형식에 맞춰서 다시 작성해주세요", Toast.LENGTH_SHORT)
            Log.e("형식오류", String())
        }


    }

    private fun doSignUp(nick: String, email: String, password: String, re_password: String) {
        ApiClient.getApiClient().signPost(nick, email, password, re_password).body()
    }
}