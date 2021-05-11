package com.example.a_la_vez.dms.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.a_la_vez.dms.data.SignUpRepository
import com.example.a_la_vez.dms.model.signUp


class SignUpViewModel {

    private var signUpRepository : SignUpRepository?= null
    var signUpListLiveData : LiveData<List<signUp>>?=null

    init{
        signUpRepository = SignUpRepository()
        //여기에 추가로
        signUpListLiveData= MutableLiveData()


    }
    fun SignPost(){
        signUpListLiveData= signUpRepository?.SignPost()

    }
}