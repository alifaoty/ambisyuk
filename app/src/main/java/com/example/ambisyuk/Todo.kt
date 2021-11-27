package com.example.ambisyuk

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Todo (
    val chores: String
): Parcelable