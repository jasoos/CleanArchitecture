package com.cryptocurrecncy.cleanarchitecture.domain.usecase.get_countries

import com.cryptocurrecncy.cleanarchitecture.common.Resource
import com.cryptocurrecncy.cleanarchitecture.data.remote.dto.toCountries
import com.cryptocurrecncy.cleanarchitecture.domain.data.Countries
import com.cryptocurrecncy.cleanarchitecture.domain.repository.CountryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCountriesUseCase @Inject constructor(
    private val repository: CountryRepository
) {

    operator fun invoke(): Flow<Resource<List<Countries>>> = flow {
        try {
            emit(Resource.Loading())
            val countries = repository.getCountries().map { it.toCountries() }
            emit(Resource.Success(countries))
        } catch (e: HttpException) {
            emit(Resource.Error("" + e.message()))
        } catch (e: IOException) {
            emit(Resource.Error("" + e.message))
        }
    }
}