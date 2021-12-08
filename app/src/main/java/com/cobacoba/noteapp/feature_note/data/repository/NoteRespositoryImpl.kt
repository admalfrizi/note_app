package com.cobacoba.noteapp.feature_note.data.repository

import com.cobacoba.noteapp.feature_note.data.data_source.NoteDao
import com.cobacoba.noteapp.feature_note.domain.model.Note
import com.cobacoba.noteapp.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRespositoryImpl(private val dao : NoteDao): NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}