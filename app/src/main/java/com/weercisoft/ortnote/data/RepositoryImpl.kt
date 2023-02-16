package com.weercisoft.ortnote.data

import androidx.lifecycle.LiveData
import com.weercisoft.ortnote.data.dao.*
import com.weercisoft.ortnote.data.mapper.*
import com.weercisoft.ortnote.domain.model.NoteModel

class RepositoryImpl(
    private val noteDao: NoteDao,
    private val colorDao: ColorDao,
    private val dbMapper: DbMapper
) : Repository {

    override fun getAllNotesNotInTrash(): LiveData<List<NoteModel>> {
        TODO("Not yet implemented")
    }

    override fun insertNote(note: NoteModel) {
        TODO("Not yet implemented")
    }
}