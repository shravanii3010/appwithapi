package com.example.appwithapi.data.remote

import com.example.appwithapi.data.remote.model.GamesModel
import retrofit2.Response
import retrofit2.http.GET
import com.example.appwithapi.util.Constants.Companion.GAMES_ENDPOINT


interface GameApi {

    @GET(GAMES_ENDPOINT)
    suspend fun getgames(): Response<List<GamesModel>>

}