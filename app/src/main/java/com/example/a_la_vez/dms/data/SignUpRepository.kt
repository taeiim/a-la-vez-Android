package com.example.a_la_vez.dms.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.a_la_vez.dms.model.Dataclass
import retrofit2.Call
import retrofit2.Callback


fun SignPost():LiveData<List<Dataclass>>{
    val data  = MutableLiveData<List<Dataclass>>()


    apiService?.SignUp()?.enqueue(object : Callback<List<Dataclass>> {

        override fun onFailed(call : Call<List<Dataclass>>, t:Throwable){
            data.value= null;
        }
    })



}
class SignUpRepository {
}