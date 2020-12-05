package com.rdsht.myandroidapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.card.MaterialCardView

class FragmentMoviesList : Fragment() {

    private var listener: ClickListener? = null;
    private var movie: MaterialCardView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies_list, container, false);
        movie = view.findViewById<MaterialCardView>(R.id.film1)
        return view;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        movie?.setOnClickListener({
            listener?.gotoDetail()
        })
    }

    fun setListener(l: ClickListener) {
        listener = l;
    }

    interface ClickListener {
        fun gotoDetail()
    }
}

