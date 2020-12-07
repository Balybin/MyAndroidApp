package com.rdsht.myandroidapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.rdsht.myandroidapp.models.DataUtil

class FragmentMoviesList : Fragment(), IMovieAdapterClickListener {

    private var moviesList: RecyclerView? = null
    private val movies = DataUtil.movieList
    private var adapter: MoviesAdapter? = null
    var listener: ClickListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        adapter = MoviesAdapter(requireContext(), movies)
        adapter?.setListener(this)
        val view = inflater.inflate(R.layout.fragment_movies_list, container, false)
        moviesList = view.findViewById<RecyclerView>(R.id.movies_list)
        moviesList?.adapter = adapter
//        moviesList?.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        moviesList?.layoutManager = GridLayoutManager(requireContext(), 2, GridLayoutManager.VERTICAL, false)
        return view;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
    fun setClickListener(_listener: ClickListener){
        listener = _listener
    }
    interface ClickListener {
        fun gotoDetail(movieId: Int)
    }

    override fun gotoMovieDetail(movieId: Int) {
        listener?.gotoDetail(movieId)
    }
}


