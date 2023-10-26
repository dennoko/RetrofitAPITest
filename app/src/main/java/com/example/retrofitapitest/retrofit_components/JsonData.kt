package com.example.retrofitapitest.retrofit_components

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JsonData (
    @SerialName("id") val id: Int,
    @SerialName("img_src") val img_src: String,
)
