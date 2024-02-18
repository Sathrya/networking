package com.example.networklib

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

abstract class RetrofitHelper<out T> {

    protected open fun createRetrofit(baseApiUrl: String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseApiUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    abstract fun createRetrofit(): T
}