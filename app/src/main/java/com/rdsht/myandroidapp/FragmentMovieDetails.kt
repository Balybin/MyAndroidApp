package com.rdsht.myandroidapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class FragmentMovieDetails : Fragment() {

    private var backText: TextView? = null
    private var backIcon: ImageView? = null
    private var listener: MovieDetailsOnClickListener? = null

    fun setListener(_listener: MovieDetailsOnClickListener){
        listener = _listener
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_movies_details, container, false)
        backText = view.findViewById<TextView>(R.id.back_text)
        backIcon = view.findViewById<ImageView>(R.id.back_icon)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backText?.setOnClickListener{
            listener?.back()
        }
        backIcon?.setOnClickListener{
            listener?.back()
        }
    }

    interface MovieDetailsOnClickListener{
        fun back()
    }
}