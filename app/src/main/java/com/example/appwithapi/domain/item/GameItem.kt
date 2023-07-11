package com.example.appwithapi.domain.item

import com.example.appwithapi.data.remote.model.GamesModel

data class GameItem(

    val id: Int,
    val title: String,
    val thumbnail: String,
    val shortDescription: String

)

fun GamesModel.toGameItem() = GameItem(id, title, thumbnail, shortDescription)
