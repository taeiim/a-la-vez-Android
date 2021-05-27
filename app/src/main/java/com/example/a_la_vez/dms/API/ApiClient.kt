package com.example.a_la_vez.dms.API

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


const val BASEURL = "http://localhost:3000"

class ApiClient {

    companion object {
        private var retrofit: Retrofit? = null
        private var retrofitApi : ApiService? = null
        fun getApiClient(): ApiService {
            val gson = GsonBuilder()
                .setLenient()
                .create()

            val okHttpClient = OkHttpClient.Builder()
                .readTimeout(100, TimeUnit.SECONDS)
                .connectTimeout(100, TimeUnit.SECONDS)
                .build()
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASEURL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            }
            retrofitApi = retrofit?.create(ApiService::class.java)
            return retrofitApi!!
        }
    }
}
