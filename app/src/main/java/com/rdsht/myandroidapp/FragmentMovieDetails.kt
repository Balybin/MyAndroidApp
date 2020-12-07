package com.rdsht.myandroidapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rdsht.myandroidapp.models.DataUtil

class FragmentMovieDetails : Fragment() {

    private var backText: TextView? = null
    private var backIcon: ImageView? = null
    private var listener: MovieDetailsOnClickListener? = null
    private var actors: RecyclerView? = null
    private val actorsList = DataUtil.actorList
    private var adapter: ActorsAdapter? = null

    fun setListener(_listener: MovieDetailsOnClickListener){
        listener = _listener
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_movies_detail, container, false)
        backText = view.findViewById<TextView>(R.id.back_text)
        backIcon = view.findViewById<ImageView>(R.id.navigation_icon)
        adapter = ActorsAdapter(requireContext(), actorsList)
        actors = view.findViewById<RecyclerView>(R.id.rv_actors)
        actors?.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        actors?.adapter = adapter

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