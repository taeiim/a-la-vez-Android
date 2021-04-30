package com.example.a_la_vez.dms.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.a_la_vez.dms.model.Dataclass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpRepository {

    fun SignPost(): LiveData<List<Dataclass>> {
        val data = MutableLiveData<List<Dataclass>>()


        apiservice?.SignPost()?.enqueue(object : Callback<List<Dataclass>> {

            fun onFailed(call: Call<List<Dataclass>>, t: Throwable) {
                data.value = null;
            }

            fun onResponse(
                    call: Call<List<Dataclass>>,
                    response: Response<List<Dataclass>>
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
