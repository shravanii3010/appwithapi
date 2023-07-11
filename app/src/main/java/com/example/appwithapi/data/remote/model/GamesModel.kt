package com.example.appwithapi.data.remote.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class GamesModel(

    val id: Int,
    val title: String,
    val thumbnail: String,
    val shortDescription: String



)