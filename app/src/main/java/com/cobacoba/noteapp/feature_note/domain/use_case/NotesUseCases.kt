package com.cobacoba.noteapp.feature_note.domain.use_case

data class NotesUseCases(

    val getNotesId: GetNotes,
    val deleteNotes: DeleteNotes,
    val addNote: AddNote,
    val getNote: GetNote
)