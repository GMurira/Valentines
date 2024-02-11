package com.example.valentineitemsapp.data

import android.media.Rating
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.valentineitemsapp.R

data class CardItems (
  @StringRes val cardDescription: Int,
    @DrawableRes val cardImg: Int,
    @StringRes val price: Int,
    @StringRes val rating: Int

 )

val cardItems = listOf(
    CardItems(R.string.rating, R.drawable.bereczki_domokos_jsczq2cpnvi_unsplash, R.string.price, R.string.rating),
    CardItems(R.string.rating, R.drawable.bereczki_domokos_jsczq2cpnvi_unsplash, R.string.price, R.string.rating),
    CardItems(R.string.rating, R.drawable.bereczki_domokos_jsczq2cpnvi_unsplash, R.string.price, R.string.rating),
    CardItems(R.string.rating, R.drawable.bereczki_domokos_jsczq2cpnvi_unsplash, R.string.price, R.string.rating),
    CardItems(R.string.rating, R.drawable.bereczki_domokos_jsczq2cpnvi_unsplash, R.string.price, R.string.rating),
    CardItems(R.string.rating, R.drawable.bereczki_domokos_jsczq2cpnvi_unsplash, R.string.price, R.string.rating),
    CardItems(R.string.rating, R.drawable.bereczki_domokos_jsczq2cpnvi_unsplash, R.string.price, R.string.rating),
    CardItems(R.string.rating, R.drawable.bereczki_domokos_jsczq2cpnvi_unsplash, R.string.price, R.string.rating),
)
