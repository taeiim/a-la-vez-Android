package com.example.a_la_vez.dms.model

data class Dataclass(
    var name : String = "",
    var nick : String = "",
    var email : String = "",
    var password : String = "",
    var re_password : String = ""
)

data class userLogin(
        var email: String,
        var password: String
)

//로그인 롹인
data class checkCode(
       var code : Int,
       val user : String
)
