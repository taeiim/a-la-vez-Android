package com.example.a_la_vez.dms.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.a_la_vez.dms.data.SignUpRepository
import com.example.a_la_vez.dms.model.SignUp


class SignUpViewModel {

    private var signUpRepository : SignUpRepository?= null
    var DataclassListLiveData : LiveData<List<SignUp>>?=null

    init{
        signUpRepository = SignUpRepository()
        //여기에 추가로
        DataclassListLiveData= MutableLiveData()


    }
    fun SignPost() {
        DataclassListLiveData = signUpRepository?.SignPost()

    }
}