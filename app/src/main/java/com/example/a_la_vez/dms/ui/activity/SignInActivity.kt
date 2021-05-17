package com.example.a_la_vez.dms.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.a_la_vez.R
import com.example.a_la_vez.dms.API.ApiClient
import com.example.a_la_vez.dms.model.UserLogin
import kotlinx.android.synthetic.main.activity_sign_in.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import splitties.activities.start

class SignInActivity : AppCompatActivity() {

    private var pressedTime: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        //비밀번호 찾기
        forgetpassword_tv.setOnClickListener() {
            val intent = Intent(this, ForgetPasswordActivity::class.java)
            startActivity(intent)
        }

        //로그인
        login_btn.setOnClickListener() {
            login()
        }
    }

    private fun intent() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun login() {

        //공백일 때
        if (email_et.text.toString() == "" || password_et.text.toString() == "") {
            val Toast = Toast.makeText(this, "공백 없이 입력하세요", Toast.LENGTH_SHORT)
            Toast.show()
        } else if (email_et.text.toString().length < 15 || password_et.text.toString().length < 15) {
            val Toast = Toast.makeText(this, "형식에 맞게 입력하세요", Toast.LENGTH_SHORT)
            Toast.show()
        }
        //로그인 형식 맞을
        else {
            val login = UserLogin(email_et.toString(), password_et.toString())
            val loginInterface = ApiClient()


//            Call.enqueue(object : Callback<Void> {
//                override fun onResponse(call: Call<Void>, response: Response<Void>) {
//                    if (response.code() == 200) {
//                        Toast.makeText(applicationContext, "로그인에 성공하였습니다", Toast.LENGTH_SHORT)
//                                .show()
//                        intent()
//
//                    } else if (response.code() == 400) {
//                        Toast.makeText(applicationContext, "로그인 실패", Toast.LENGTH_SHORT)
//                                .show()
//                    }
//                }
//
//                override fun onFailure(call: Call<Void>, t: Throwable) {
//                    Log.d("dsfsf",toString())
//                }
//            })
        }
    }

    override fun onBackPressed() {
        if (pressedTime == 0) {
            Toast.makeText(this, " 한 번 더 누르면 종료됩니다.", Toast.LENGTH_LONG).show();
            pressedTime = System.currentTimeMillis().toInt();
        } else {
            val seconds = (System.currentTimeMillis() - pressedTime);

            if (seconds > 2000) {
                Toast.makeText(this, " 한 번 더 누르면 종료됩니다.", Toast.LENGTH_LONG).show();
                pressedTime = 0;
            } else {
                super.onBackPressed();
                finish(); // app 종료 시키기
            }
        }
    }
}