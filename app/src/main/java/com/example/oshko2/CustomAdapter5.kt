package com.example.oshko2

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import java.text.FieldPosition

class CustomAdapter5 : RecyclerView.Adapter<CustomAdapter5.ViewHolder>(){

    val sizeProducts = products.myShippings.size

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout_shipping, viewGroup, false)
        return ViewHolder(v)
    }


    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.productName.text = products.myShippings[i].tittle
        viewHolder.productDescription.text = products.myShippings[i].description
        viewHolder.itemImage.setImageResource(products.myShippings[i].image)
        viewHolder.quantity.text = products.myShippings[i].quantity.toString()
        viewHolder.priceText.text = (products.myShippings[i].price * products.myShippings[i].quantity.toFloat()).toString()
    }

    override fun getItemCount(): Int {
        return sizeProducts
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var productName: TextView
        var productDescription: TextView
        var quantity: TextView
        var priceText : TextView

        init{
            itemImage = itemView.findViewById(R.id.item_image)
            productName = itemView.findViewById(R.id.name_product)
            productDescription = itemView.findViewById(R.id.description_product)
            quantity = itemView.findViewById(R.id.quantityToAdd)
            priceText = itemView.findViewById(R.id.precioText)
        }
    }
}