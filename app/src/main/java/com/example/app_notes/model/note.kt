package com.example.app_notes.model

import kotlinx.serialization.Serializable

@Serializable
data class Note(
    val id:String,
    val title:String,
    val description:String,
    val status:String
)