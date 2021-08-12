package com.example.oshko2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

class CustomAdapter : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){


    //val names = arrayOf("hoja","facebook")
    //val descriptions = arrayOf("Es una hoja","Es el logo de facebook")
    //val images = intArrayOf(R.drawable.leave, R.drawable.logoface)


    
    val products = RegisterProduct()
    val sizeProducts = products.myProductGroup.size

    private lateinit var mListener: onItemClickListener

    interface onItemClickListener{

        fun onItemClick (position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout_seccion, viewGroup, false)
        return ViewHolder(v, mListener)
    }


    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.productName.text = products.myProductGroup[i].name
        //viewHolder.productDescription.text = descriptions[i]
        viewHolder.itemImage.setImageResource(products.myProductGroup[i].image)
    }

    override fun getItemCount(): Int {
        return sizeProducts
    }

    inner class ViewHolder(itemView: View , listener: onItemClickListener): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var productName: TextView
        //var productDescription: TextView

        init{
            itemImage = itemView.findViewById(R.id.item_image)
            productName = itemView.findViewById(R.id.name_product)
            //productDescription = itemView.findViewById(R.id.description_product)

            itemView.setOnClickListener{
                listener.onItemClick(absoluteAdapterPosition)

            }

        }

    }
}