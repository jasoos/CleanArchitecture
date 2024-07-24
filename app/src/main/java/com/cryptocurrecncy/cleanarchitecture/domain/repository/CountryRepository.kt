package com.cryptocurrecncy.cleanarchitecture.domain.repository

import com.cryptocurrecncy.cleanarchitecture.data.remote.dto.CountriesDTO

interface CountryRepository {
    suspend fun getCountries() : List<CountriesDTO>
}