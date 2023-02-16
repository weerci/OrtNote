package com.weercisoft.ortnote.data

import androidx.lifecycle.LiveData
import com.weercisoft.ortnote.domain.model.NoteModel

interface Repository {

    fun getAllNotesNotInTrash(): LiveData<List<NoteModel>>

    fun insertNote(note: NoteModel)


}