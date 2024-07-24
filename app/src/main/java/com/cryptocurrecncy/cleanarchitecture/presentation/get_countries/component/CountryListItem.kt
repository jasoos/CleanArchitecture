package com.cryptocurrecncy.cleanarchitecture.presentation.get_countries.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.cryptocurrecncy.cleanarchitecture.R
import com.cryptocurrecncy.cleanarchitecture.domain.data.Countries


@Composable
fun CountryItem(countries: Countries) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        AsyncImage(
            model = countries.flags.png,
            contentDescription = countries.name.official,
            placeholder = painterResource(id = R.drawable.ic_launcher_background)
        )

        Text(
            text = countries.name.official,
            color = Color.Black,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.align(CenterVertically)
        )
    }
}