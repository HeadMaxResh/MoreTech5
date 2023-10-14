package com.example.moretech5.presentation.domain.api

import com.example.moretech5.presentation.domain.model.Office
import retrofit2.Call
import retrofit2.http.GET

interface VtbWorkloadAPI {
    @GET("/v1/offices")
    fun getOffices(): Call<List<Office>>
}