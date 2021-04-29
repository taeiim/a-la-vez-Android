package com.example.a_la_vez.dms.API

import com.example.a_la_vez.dms.model.Dataclass
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    //회원가입 Post로 요청할 때 , Body에 넣어서 보내는 것
    @POST("/auth/join")
    fun SignUp(@Body body : Body) : Call<Dataclass>


}