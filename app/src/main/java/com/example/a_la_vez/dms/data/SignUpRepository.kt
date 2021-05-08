package com.example.a_la_vez.dms.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.a_la_vez.dms.model.SignUp
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpRepository {

    fun SignPost(): LiveData<List<SignUp>> {
        val data = MutableLiveData<List<SignUp>>()


        apiservice?.SignPost()?.enqueue(object : Callback<List<SignUp>> {

            fun onFailed(call: Call<List<SignUp>>, t: Throwable) {
                data.value = null;
            }

            fun onResponse(
                    call: Call<List<SignUp>>,
                    response: Response<List<SignUp>>
            ) {

                val res = response.body()
                if (response.code = 200) {
                    data.value = res
                } else {
                    data.value = null
                }
            }

        })
        return data

    }
}
