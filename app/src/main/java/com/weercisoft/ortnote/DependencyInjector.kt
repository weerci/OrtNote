package com.weercisoft.ortnote

import android.content.Context
import androidx.room.Room
import com.weercisoft.ortnote.data.AppDatabase
import com.weercisoft.ortnote.data.Repository
import com.weercisoft.ortnote.data.RepositoryImpl
import com.weercisoft.ortnote.data.mapper.*

class DependencyInjector(app: Context) {

    val repository: Repository by lazy { provideRepository(database) }
    private val database: AppDatabase by lazy { provideDatabase(app) }

    private val dbMapper: DbMapper = DbMapperImpl()

    private fun provideDatabase(applicationContext: Context): AppDatabase =
        Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            AppDatabase.DATABASE_NAME
        ).build()

    private fun provideRepository(database: AppDatabase): Repository {
        val noteDao = database.noteDao()
        val colorDao = database.colorDao()

        return RepositoryImpl(noteDao, colorDao, dbMapper)
    }
}