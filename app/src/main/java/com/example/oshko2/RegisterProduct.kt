package com.example.oshko2

class RegisterProduct {

    val dulces = ProductGroup(1, "Dulces", R.drawable.leave)
    val cremas = ProductGroup(2, "Cremas", R.drawable.facebook)


    val fresa = Product(1,"Fresa", "Es una fresa", R.drawable.leave , 10.22f)
    val face = Product(2,"Face", "Este es el feis", R.drawable.logoface , 10.22f)

    val myProducts: MutableList<Product> = mutableListOf(fresa, face)
    val myProductGroup: MutableList<ProductGroup> = mutableListOf(dulces, cremas)

}

