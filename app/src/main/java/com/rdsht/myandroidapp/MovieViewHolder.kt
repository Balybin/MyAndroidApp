package com.rdsht.myandroidapp

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.idlestar.ratingstar.RatingStarView
import com.rdsht.myandroidapp.models.Movie
import kotlinx.android.synthetic.main.view_holder_movie.view.*

class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val avatar: ImageView = itemView.findViewById(R.id.movie_avatar)
    private val movieName: TextView = itemView.findViewById(R.id.movie_name)
    private val minAge: TextView = itemView.findViewById(R.id.min_age_preview)
    private val isFavorite: ImageView = itemView.findViewById(R.id.like)
    private val numOfReviews: TextView = itemView.findViewById(R.id.number_of_reviews)
    private val duration: TextView = itemView.findViewById(R.id.movie_duration)
    private val genres: TextView = itemView.findViewById(R.id.movie_genres)
    private val rating: RatingStarView = itemView.findViewById(R.id.rating_bar)
    private val card: MaterialCardView = itemView.findViewById(R.id.card_view)
    private var listener: ICardClickListener? = null

    fun bind(movie: Movie, context: Context?) {
        avatar.setImageDrawable(context?.getDrawable(movie.avatarImageId))
        movieName.text = movie.movieName
        minAge.text = movie.minimalAge.toString() + '+'
        if (movie.isFavorite) isFavorite.setImageDrawable(context?.getDrawable(R.drawable.ic_like_red))
        else isFavorite.setImageDrawable(context?.getDrawable(R.drawable.ic_like))
        numOfReviews.text = movie.numberOfReviews.toString() + "REVIEWS"
        duration.text = movie.durationInMinutes.toString() + "MIN"
        genres.text = movie.genres.joinToString()
        rating.rating = movie.rating.toFloat()
        card.setOnClickListener{
            listener?.click(0)
        }
    }

    fun setListener(_listener: ICardClickListener) {
        listener = _listener
    }
}

interface ICardClickListener {
    fun click(movieId: Int)
}