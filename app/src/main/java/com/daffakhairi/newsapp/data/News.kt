package com.daffakhairi.newsapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class News(
    val title : String,
    val content : String,
    val date : String,
    val author : String,
    val time : String,
    val photo : Int,
    val category : String,
) : Parcelable

// contoh dari data class yang di ubah menjadi class datanya menjadi panjang jadi di buat data class
// agar menjadi lebih simpel
// val data = arrayOf(News("IDN","sekolah"),News("Jakarta","kota"),News("Bogor","Jawa Barat"))