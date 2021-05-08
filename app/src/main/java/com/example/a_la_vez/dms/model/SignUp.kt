package com.example.a_la_vez.dms.model

data class SignUp(
    val name : String = "",
    val nick : String = "",
    val email : String = "",
    val password : String = "",
    val re_password : String = ""
)

data class UserLogin(
        val email: String,
        val password: String
)

//로그인 롹인
data class CheckCode(
       val code : Int,
       var user: User
)

//return SignIn
data class User(
        val name:String,
        val email: String,
        val nick : String
)


