package com.example.appwithapi.repo

import com.example.appwithapi.data.remote.GameService
import com.example.appwithapi.domain.item.GameItem
import com.example.appwithapi.domain.item.toGameItem
import javax.inject.Inject
import kotlin.collections.map

class GameRepository @Inject constructor(private val gameService: GameService) {
    
    suspend fun getGames(): List<GameItem> {
        
        return gameService.getGames().map {
            it.toGameItem()
        }
    }
}