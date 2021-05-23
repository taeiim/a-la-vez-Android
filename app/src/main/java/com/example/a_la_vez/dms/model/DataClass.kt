package com.example.a_la_vez.dms.model

//회원가입
data class DataClass(
    val name : String ,
    val nick : String ,
    val email : String ,
    val password : String ,
    val re_password : String
)


//로그인
data class signIn(
     val email : String,
     val password: String
)

//인증코드 입력
data class checkCode(
    val code : String,
    val user : DataClass
)

