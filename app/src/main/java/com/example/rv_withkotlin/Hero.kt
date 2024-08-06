package com.example.rv_withkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Hero(val name:String,val deskripsi:String,val photp:Int):Parcelable
