package com.weercisoft.ortnote.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.weercisoft.ortnote.data.dao.ColorDao
import com.weercisoft.ortnote.data.dao.NoteDao
import com.weercisoft.ortnote.data.model.ColorDbModel
import com.weercisoft.ortnote.data.model.NoteDbModel

@Database(entities = [NoteDbModel::class, ColorDbModel::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    companion object {
        const val DATABASE_NAME = "ort_note_database"
    }

    abstract fun noteDao(): NoteDao
    abstract fun colorDao(): ColorDao
}