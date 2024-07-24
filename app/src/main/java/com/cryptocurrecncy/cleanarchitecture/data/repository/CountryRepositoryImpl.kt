package com.cryptocurrecncy.cleanarchitecture.data.repository

import com.cryptocurrecncy.cleanarchitecture.data.remote.CountriesAPI
import com.cryptocurrecncy.cleanarchitecture.data.remote.dto.CountriesDTO
import com.cryptocurrecncy.cleanarchitecture.domain.repository.CountryRepository
import javax.inject.Inject

class CountryRepositoryImpl @Inject constructor(
    private val apis: CountriesAPI
) : CountryRepository {
    override suspend fun getCountries(): List<CountriesDTO> {
        return apis.getCountries()
    }
}