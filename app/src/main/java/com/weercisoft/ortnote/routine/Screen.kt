package com.weercisoft.ortnote.routine

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

sealed class Screen {
    object Notes : Screen()
    object SaveNote : Screen()
    object Trash : Screen()
}

object OrtNoteRoutine {
    var currentScreen: Screen by mutableStateOf(Screen.Notes)

    fun navigateTo(dest: Screen) {
        currentScreen = dest
    }

}