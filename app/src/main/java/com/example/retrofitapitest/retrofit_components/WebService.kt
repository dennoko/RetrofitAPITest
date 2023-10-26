package com.example.retrofitapitest.retrofit_components

import retrofit2.http.GET

interface WebService {
    @GET("photos")
    fun getPhotos(): String
}