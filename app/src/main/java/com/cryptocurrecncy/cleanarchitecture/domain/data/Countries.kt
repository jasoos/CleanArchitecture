package com.cryptocurrecncy.cleanarchitecture.domain.data

import com.cryptocurrecncy.cleanarchitecture.data.remote.dto.Flags
import com.cryptocurrecncy.cleanarchitecture.data.remote.dto.Name

data class Countries(
    val name: Name,
    val flags: Flags
)
