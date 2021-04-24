package com.example.bookstore.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
//import kotlinx.parcelize.Parcelize

@Parcelize
data class Book (
    var imgBook : Int = 0,
    var describeBook : String? = null,
    var nameBook : String? =null

): Parcelable