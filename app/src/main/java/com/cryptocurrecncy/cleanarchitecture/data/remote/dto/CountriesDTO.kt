package com.cryptocurrecncy.cleanarchitecture.data.remote.dto

import com.cryptocurrecncy.cleanarchitecture.domain.data.Countries

data class CountriesDTO(
    val altSpellings: List<String>,
    val area: Int,
    val capital: List<String>,
    val capitalInfo: CapitalInfo,
    val continents: List<String>,
    val currencies: Currencies,
    val flag: String,
    val flags: Flags,
    val idd: Idd,
    val independent: Boolean,
    val landlocked: Boolean,
    val languages: Languages,
    val latlng: List<Double>,
    val maps: Maps,
    val name: Name,
    val population: Int,
    val postalCode: PostalCode,
    val region: String,
    val startOfWeek: String,
    val status: String,
    val subregion: String,
    val timezones: List<String>,
    val tld: List<String>,
    val unMember: Boolean
)

fun CountriesDTO.toCountries() : Countries{
    return Countries(
        name = name,
        flags = flags
    )
}