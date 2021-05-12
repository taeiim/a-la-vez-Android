package com.example.a_la_vez.dms.model

data class signUp(
    var name : String = "",
    var nick : String = "",
    var email : String = "",
    val password : String ,
    val re_password : String
)

data class signIn(
     val email : String,
     val password: String
)

