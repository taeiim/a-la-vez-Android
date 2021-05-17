package com.example.a_la_vez.dms.API

import com.example.a_la_vez.dms.model.CheckCode
import com.example.a_la_vez.dms.model.User
import com.example.a_la_vez.dms.model.UserLogin
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {

    //회원가입
   @POST("/auth/join")
    fun signPost(@Query("name") name: String,
                 @Query("nick") nick: String,
                 @Query("email") email: String,
                 @Query("password") password: String,
                 @Query("re_password") re_password: String,
    ): Single<Response<Any>>

    //로그인
    @POST("/auth/login")
    fun login(
            @Query("email") email : String,
            @Query("password") password: String
    ): Single<Response<UserLogin>>

    //이메일 인증
    @POST("/auth/code")
    fun checkCode(
            @Body checkCode: CheckCode
    )






}