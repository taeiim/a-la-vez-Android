package com.example.a_la_vez.dms.API

import android.provider.ContactsContract
import com.example.a_la_vez.dms.model.Dataclass
import com.example.a_la_vez.dms.model.userLogin
import io.reactivex.Single
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    //회원가입
   @POST("/auth/join")
    fun SignPost(@Query("name") name: String,
                 @Query("nick") nick: String,
                 @Query("email") email: String,
                 @Query("password") password: String,
                 @Query("re_password") re_password: String,
    ): Single<Response<Any>>

    //로그인
    @POST("/auth/login")
    fun login(
            @Query("ddfs") email : String,
            @Query("password") password: String
    ): Single<Response<userLogin>>

    //이메일 인증






}