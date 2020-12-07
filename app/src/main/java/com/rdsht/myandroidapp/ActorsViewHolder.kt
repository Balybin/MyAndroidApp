package com.rdsht.myandroidapp

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rdsht.myandroidapp.models.Actor

class ActorsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var avatar: ImageView = itemView.findViewById(R.id.iv_actor)
    private var name: TextView = itemView.findViewById(R.id.tv_actor)


    fun bind(actor: Actor, context: Context){
        avatar.setImageDrawable(context.getDrawable(actor.imageId))
        name.text = actor.name
    }
}