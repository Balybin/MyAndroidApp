package com.rdsht.myandroidapp.models

import com.rdsht.myandroidapp.R

class DataUtil {
    companion object {
        val movieList = listOf<Movie>(
            Movie(
                avatarImageId = R.drawable.movie_poster,
                movieName = "Avengers: End Game",
                rating = 4,
                isFavorite = false,
                genres = listOf("Action", "Adventure", "Drama"),
                numberOfReviews = 125,
                durationInMinutes = 137,
                minimalAge = 13,
                cast = null,
                storyLine = null
            ),
            Movie(
                avatarImageId = R.drawable.tenet,
                movieName = "Tenet",
                rating = 5,
                isFavorite = true,
                genres = listOf("Action", "Sci-Fi", "Thriller"),
                numberOfReviews = 98,
                durationInMinutes = 97,
                minimalAge = 16,
                cast = null,
                storyLine = null
            ),
            Movie(
                avatarImageId = R.drawable.black_widow,
                movieName = "Black Widow",
                rating = 5,
                isFavorite = false,
                genres = listOf("Action", "Sci-Fi", "Adventure"),
                numberOfReviews = 38,
                durationInMinutes = 102,
                minimalAge = 13,
                cast = null,
                storyLine = null
            ),
            Movie(
                avatarImageId = R.drawable.ww,
                movieName = "Wonder Woman 1984",
                rating = 5,
                isFavorite = false,
                genres = listOf("Action", "Adventure", "Fantasy"),
                numberOfReviews = 74,
                durationInMinutes = 120,
                minimalAge = 13,
                cast = null,
                storyLine = null
            )
        )
        val actorList = listOf<Actor>(
            Actor(
                name = "Robert Downey Jr.",
                imageId = R.drawable.robert_downey_jr
            ),
            Actor(
                name = "Chris Evans",
                imageId = R.drawable.chris_evans
            ),
            Actor(
                name = "Mark Ruffalo",
                imageId = R.drawable.mark_ruffalo
            ),
            Actor(
                name = "Chris Hemsworth",
                imageId = R.drawable.chris_hemsworth
            )
        )
    }
}