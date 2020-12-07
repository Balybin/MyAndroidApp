package com.rdsht.myandroidapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rdsht.myandroidapp.models.Movie


class MoviesAdapter(
    private val context: Context,
    var moviesList: List<Movie>
) : RecyclerView.Adapter<MovieViewHolder>(), ICardClickListener {
    private var listener: IMovieAdapterClickListener? = null

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getItemCount() = moviesList.size

    fun getItem(position: Int): Movie = moviesList[position]

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(inflater.inflate(R.layout.view_holder_movie, parent, false))
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(getItem(position),context)
        holder.setListener(this)
    }
    fun setListener(_listener: IMovieAdapterClickListener){
        this.listener = _listener
    }
    override fun click(movieId: Int) {
        listener?.gotoMovieDetail(movieId)
    }
}

interface IMovieAdapterClickListener{
    fun gotoMovieDetail(movieId: Int)
}