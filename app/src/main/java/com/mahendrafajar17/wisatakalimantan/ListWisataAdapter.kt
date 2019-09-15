package com.mahendrafajar17.wisatakalimantan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView

class ListWisataAdapter(private val listWisata: ArrayList<Wisata>) : RecyclerView.Adapter<ListWisataAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_wisata, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, detail, photo) = listWisata[position]

        Glide.with(holder.itemView.context).load(photo).apply(RequestOptions().override(55,55)).into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvDetail.text = detail

        holder.itemView.setOnClickListener{onItemClickCallback.onItemClicked(listWisata[position])}
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: CircleImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback{
        fun onItemClicked(wisata: Wisata)
    }
}