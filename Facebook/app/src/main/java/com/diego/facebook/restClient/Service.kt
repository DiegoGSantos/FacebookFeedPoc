package com.diego.facebook.restClient

import com.diego.facebook.Post
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call

interface Service {

    @retrofit2.http.GET("/")
    fun getFeed(): Call<List<Post>>

    companion object Factory {
        fun create(): Service {

            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY

            val httpClient = OkHttpClient.Builder()

            httpClient.addInterceptor(logging)

            val retrofit = retrofit2.Retrofit.Builder()
                .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create())
                .client(httpClient.build())
                .baseUrl("http://10.0.2.2:3000")
                .build()

            return retrofit.create(Service::class.java)
        }
    }
}