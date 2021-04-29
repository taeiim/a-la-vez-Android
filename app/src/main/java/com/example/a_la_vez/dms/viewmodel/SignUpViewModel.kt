package com.example.a_la_vez.dms.viewmodel

import androidx.lifecycle.LiveData
import com.example.a_la_vez.dms.data.SignUpRepository
import com.example.a_la_vez.dms.model.Dataclass


class SignUpViewModel {

    private var signUpRepository : SignUpRepository?= null
    var DataclassListLiveData : LiveData<List<Dataclass>>?=null

    init{
        signUpRepository = SignUpRepository()
        //여기에 추가로
        DataclassListLiveData = MutableListData()

    }
    fun SignPost(){
        DataclassListLiveData= signUpRepository?.SignPost()
    }
}