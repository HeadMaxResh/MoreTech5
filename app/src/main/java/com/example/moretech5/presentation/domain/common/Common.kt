package com.example.moretech5.presentation.domain.common

import com.example.moretech5.presentation.domain.api.VtbWorkloadAPI
import com.example.moretech5.presentation.domain.retrofit.RetrofitClient

object Common {
    //TODO insert url
    private val BASE_URL = "https://..."
    val retrofitService: VtbWorkloadAPI
        get() = RetrofitClient.getClient(BASE_URL).create(VtbWorkloadAPI::class.java)
}