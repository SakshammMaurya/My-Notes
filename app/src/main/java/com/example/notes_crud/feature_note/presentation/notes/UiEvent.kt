package com.example.notes_crud.feature_note.presentation.notes

sealed class UiEvent {
    data class ShowSnackBar(val message: String): UiEvent()
    object SaveNote:  UiEvent()
}