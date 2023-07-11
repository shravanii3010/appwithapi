package com.example.appwithapi.domain

import com.example.appwithapi.domain.item.GameItem
import com.example.appwithapi.repo.GameRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(): List<GameItem> {

        return gameRepository.getGames().shuffled()

    }
}