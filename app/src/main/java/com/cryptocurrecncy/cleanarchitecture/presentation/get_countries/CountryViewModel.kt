package com.cryptocurrecncy.cleanarchitecture.presentation.get_countries

import androidx.lifecycle.ViewModel
import com.cryptocurrecncy.cleanarchitecture.domain.usecase.get_countries.GetCountriesUseCase
import javax.inject.Inject

class CountryViewModel @Inject constructor(private val getCountriesUseCase: GetCountriesUseCase) :
    ViewModel() {

        
}