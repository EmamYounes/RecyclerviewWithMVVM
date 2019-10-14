package com.example.recyclerviewwithmvvm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recyclerviewwithmvvm.R
import com.example.recyclerviewwithmvvm.model.NicePlaces
import kotlinx.android.synthetic.main.nice_place_lauout.view.*

class NicePlacesAdapter(var nicePlaceList: Array<NicePlaces>, var context: Context?) :
    RecyclerView.Adapter<NicePlacesAdapter.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.profileTitle.text = nicePlaceList[position].title
        val option = RequestOptions()
//        Glide.with(context).
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.nice_place_lauout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return nicePlaceList.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val profileImage = view.profile_image
        val profileTitle = view.profile_title
    }

}