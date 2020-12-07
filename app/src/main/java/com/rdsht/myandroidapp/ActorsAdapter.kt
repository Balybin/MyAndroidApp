package com.rdsht.myandroidapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rdsht.myandroidapp.models.Actor

class ActorsAdapter(
    private val context: Context,
    var actors: List<Actor>
) : RecyclerView.Adapter<ActorsViewHolder>(){
    fun getItem(position: Int):Actor = actors[position]

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorsViewHolder {
        return ActorsViewHolder(inflater.inflate(R.layout.view_holder_actor, parent, false))
    }

    override fun onBindViewHolder(holder: ActorsViewHolder, position: Int) {
        holder.bind(getItem(position), context)
    }

    override fun getItemCount(): Int = actors.size

}