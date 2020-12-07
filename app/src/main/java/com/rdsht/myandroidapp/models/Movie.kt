package com.rdsht.myandroidapp.models

data class Movie(
    val movieName: String,
    val avatarImageId: Int,
    val rating: Int,
    val isFavorite: Boolean,
    val genres: List<String>,
    val numberOfReviews: Int,
    val durationInMinutes: Int,
    val minimalAge: Int,
    val cast: List<String>?,
    val storyLine: String?
)