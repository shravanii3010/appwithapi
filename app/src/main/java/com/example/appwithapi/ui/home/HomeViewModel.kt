package com.example.appwithapi.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appwithapi.domain.GetGamesUseCase
import com.example.appwithapi.domain.item.GameItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val getGamesUseCase: GetGamesUseCase) : ViewModel(){

    private val _games = MutableStateFlow(emptyList<GameItem>())
    val games: StateFlow<List<GameItem>> get() = _games

    init {
        getGames()

    }

    private fun getGames() {

        viewModelScope.launch {


             try {

             val games = getGamesUseCase()
             _games.value = games

             } catch (_: Exception) {}
        }
    }


}