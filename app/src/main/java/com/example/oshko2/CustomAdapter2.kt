package com.example.oshko2

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import java.text.FieldPosition

class CustomAdapter2 : RecyclerView.Adapter<CustomAdapter2.ViewHolder>(){




    val products = RegisterProduct()
    val sizeProducts = products.myProducts.size

    private lateinit var mListener: onItemClickListener

    interface onItemClickListener{

        fun onItemClick (position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v, mListener)
    }


    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.productName.text = products.myProducts[i].tittle
        viewHolder.productDescription.text = products.myProducts[i].description
        viewHolder.itemImage.setImageResource(products.myProducts[i].image)
    }

    override fun getItemCount(): Int {
        return sizeProducts
    }

    inner class ViewHolder(itemView: View , listener: onItemClickListener): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var productName: TextView
        var plus: ImageView
        var delete: ImageView
        var productDescription: TextView
        var quantity: TextView

        init{
            itemImage = itemView.findViewById(R.id.item_image)
            productName = itemView.findViewById(R.id.name_product)
            plus = itemView.findViewById(R.id.addButton)
            delete = itemView.findViewById(R.id.deleteButton)
            productDescription = itemView.findViewById(R.id.description_product)
            quantity = itemView.findViewById(R.id.quantityToAdd)


            itemView.setOnClickListener{
                listener.onItemClick(absoluteAdapterPosition)
            }

            plus.setOnClickListener{
                listener.onItemClick(absoluteAdapterPosition)
            }

            delete.setOnClickListener{
                listener.onItemClick(absoluteAdapterPosition)
            }

        }

    }
}