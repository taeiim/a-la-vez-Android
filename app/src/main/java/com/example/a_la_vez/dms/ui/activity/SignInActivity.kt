package com.example.a_la_vez.dms.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.a_la_vez.R
import com.example.a_la_vez.dms.API.ApiClient
import com.example.a_la_vez.dms.model.UserLogin
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_in.login_btn
import kotlinx.android.synthetic.main.activity_sign_up.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import splitties.activities.start
import kotlin.Unit.toString

class SignInActivity : AppCompatActivity() {

    private var pressedTime: Int = 0
    private lateinit var toast: Toast
    private var email_et = findViewById<EditText>(R.id.email_et)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        login_btn.setOnClickListener() {
            if (email_et.text.toString() == "" || password_et.text.toString() == "") {
                val Toast = Toast.makeText(this, "공백 없이 입력하세요", Toast.LENGTH_SHORT)
                Toast.show()
            } else if (email_et.text.toString().length < 15 || password_et.text.toString().length < 15) {
                val Toast = Toast.makeText(this, "형식에 맞게 입력하세요", Toast.LENGTH_SHORT)
                Toast.show()
            }
            //로그인 형식이 맞음
            else {
                val login = UserLogin(email_et.toString(), password_et.toString())
                val loginInterface = ApiClient()
                val Toast = Toast.makeText(this, "로그인에 성공하셨습니다", Toast.LENGTH_SHORT)
                intent()
                toast.show()

            }
        }
    }

    private fun intent() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
