package com.cryptocurrecncy.cleanarchitecture.di

import com.cryptocurrecncy.cleanarchitecture.data.remote.CountriesAPI
import com.cryptocurrecncy.cleanarchitecture.data.repository.CountryRepositoryImpl
import com.cryptocurrecncy.cleanarchitecture.domain.repository.CountryRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideCountryApi(): CountriesAPI {
        return Retrofit.Builder().baseUrl("")
            .addConverterFactory(GsonConverterFactory
            .create())
            .build().create(CountriesAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CountriesAPI) : CountryRepository{
        return CountryRepositoryImpl(api)
    }
}