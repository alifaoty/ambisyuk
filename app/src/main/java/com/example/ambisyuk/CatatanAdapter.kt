package com.example.ambisyuk

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CatatanAdapter(private val context: Context, private val catatan: List<Catatan>, private val listener: (Catatan) -> Unit)
    :RecyclerView.Adapter<CatatanAdapter.CatatanViewHolder>() {

    class CatatanViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgCatatan = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameCatatan = view.findViewById<TextView>(R.id.tv_item_name)
        val descCatatan = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(catatan: Catatan, listener: (Catatan) -> Unit){
           imgCatatan.setImageResource(catatan.imgCatatan)
           nameCatatan.text = catatan.nameCatatan
           descCatatan.text = catatan.descCatatan
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatatanViewHolder {
        return CatatanViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_catatan, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CatatanViewHolder, position: Int) {
        holder.bindView(catatan[position], listener)
    }

    override fun getItemCount(): Int = catatan.size
    }