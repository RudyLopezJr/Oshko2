package com.example.oshko2

class RegisterProduct {

    val dulces = ProductGroup(1, "Dulces", R.drawable.leave)
    val cremas = ProductGroup(2, "Cremas", R.drawable.logoface)
    val frutas = ProductGroup(3,"Frutas", R.drawable.logogoogle)
    val botanas = ProductGroup(4,"Frutas", R.drawable.logoinsta)


    val fresa = Product(1,"Fresa", "Es una fresa", R.drawable.leave , 10.22f)
    val face = Product(2,"Face", "Este es el feis", R.drawable.logoface , 10.22f)



    val myProducts: MutableList<Product> = mutableListOf(fresa, face,)

    val myProductsDulces : MutableList<Product> = mutableListOf()
    val myProductsCremas : MutableList<Product> = mutableListOf()
    val myProductsFrutas : MutableList<Product> = mutableListOf()
    val myProductsBotanas : MutableList<Product> = mutableListOf()

    val myProductGroup: MutableList<ProductGroup> = mutableListOf(dulces, cremas, frutas, botanas)

}

