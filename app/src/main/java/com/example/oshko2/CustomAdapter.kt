package com.example.oshko2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    val names = arrayOf("hoja","facebook")
    val descriptions = arrayOf("Es una hoja","Es el logo de facebook")
    val images = intArrayOf(R.drawable.leave, R.drawable.logoface)




    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.productName.text = names[i]
        viewHolder.productDescription.text = descriptions[i]
        viewHolder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int {
        return names.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var productName: TextView
        var productDescription: TextView

        init{
            itemImage = itemView.findViewById(R.id.item_image)
            productName = itemView.findViewById(R.id.name_product)
            productDescription = itemView.findViewById(R.id.description_product)

        }

    }
}