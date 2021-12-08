package com.cobacoba.noteapp.feature_note.presentation.add_edit_note

import androidx.compose.ui.focus.FocusState

sealed class AddEditNodeEvent{

    data class EnteredTitle(val value: String): AddEditNodeEvent()
    data class ChangeTitleFocus(val focusState: FocusState): AddEditNodeEvent()
    data class EnteredContent(val value: String): AddEditNodeEvent()
    data class ChangeContentFocus(val focusState: FocusState): AddEditNodeEvent()
    data class ChangeColor(val color: Int): AddEditNodeEvent()
    object SaveNote : AddEditNodeEvent()
}