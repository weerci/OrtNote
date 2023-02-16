package com.weercisoft.ortnote.domain.model

const val NEW_ID_NOTE: Long = -1L

data class NoteModel(
    val id: Long = NEW_ID_NOTE,
    val title: String = "",
    val content: String = "",
    val isChecked: Boolean = false,
    val color: ColorModel = ColorModel.DEFAULT

)