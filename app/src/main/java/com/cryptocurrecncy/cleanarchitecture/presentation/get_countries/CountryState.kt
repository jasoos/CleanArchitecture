package com.cryptocurrecncy.cleanarchitecture.presentation.get_countries

import com.cryptocurrecncy.cleanarchitecture.domain.data.Countries

data class CountryState(
    val isLoading: Boolean = true,
    val countries: List<Countries> = emptyList(),
    val error: String? = null
)