package com.example.unscramble.ui

data class GameUiState(
    val currentUnscrambledWord : String = "",
    val currentWordCount: Int = 1,
    val isGuessedWordWrong: Boolean = false,
    val score: Int = 0,
    val isGameOver: Boolean = false
)
