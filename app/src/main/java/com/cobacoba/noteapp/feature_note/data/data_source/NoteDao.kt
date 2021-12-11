package com.cobacoba.noteapp.feature_note.data.data_source

import androidx.room.*
import com.cobacoba.noteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes() : Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    fun getNoteById(id : Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note : Note)

    @Delete
    fun deleteNote(note : Note)
}