package com.cryptocurrecncy.cleanarchitecture.data.remote

import com.cryptocurrecncy.cleanarchitecture.data.remote.dto.CountriesDTO
import retrofit2.http.GET

interface CountriesAPI {
    @GET("/v3.1/all")
    suspend fun getCountries() : List<CountriesDTO>
}