package com.example.ambisyuk

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Catatan(
    val imgCatatan: Int,
    val nameCatatan: String,
    val descCatatan: String
) : Parcelable