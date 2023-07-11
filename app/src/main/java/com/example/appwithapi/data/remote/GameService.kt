package com.example.appwithapi.data.remote

import com.example.appwithapi.data.remote.model.GamesModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class GameService @Inject constructor(private val gameApi: GameApi){

    suspend fun getGames(): List<GamesModel>{

        return withContext(Dispatchers.IO) {
            val games = gameApi.getgames()
            games.body() ?: emptyList()
        }
    }
}