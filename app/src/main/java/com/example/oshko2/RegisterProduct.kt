package com.example.oshko2

class RegisterProduct {

    val cremas = ProductGroup(2, "Cremas", R.drawable.c_cremas)
    val dulces = ProductGroup(1, "Dulces", R.drawable.c_dulces)
    val salsas = ProductGroup(3,"Salsas", R.drawable.c_salsas)
    val botanas = ProductGroup(4,"Botanas", R.drawable.c_botanas)

    //CREMAS
    val c_almendras= Product(11,"Crema de cacahuate y almendras", "ANCESTRAL 300gr de crema de cacahuate artesanal con almendras", R.drawable.crema_almendras , 129.00f, 0)
    val c_avecacao = Product(12,"Crema de avellana y cacao", "VERDE MIO 200gr Crema de Avellana Cacao", R.drawable.crema_avellanacacao , 180.00f,0)
    val c_cacaoa= Product(13,"Crema de cacahuate, cacao y arándanos", "ANCESTRAL 300gr de crema de cacahuate artesanal con cacao y arandanos", R.drawable.crema_cacao, 120.00f,0)
    val c_pistache= Product(14,"Crema de cacahuate y pistache", "ANCESTRAL 300gr de crema de cacahuate artesanal con pistache", R.drawable.crema_pistache , 179.90f, 0)

    //DULCES
    val d_fresa = Product(21,"Xplosion balls frutos rojos", "INFINY 50gr de dulce de frutos rojos sin azucar añadadida, 100% pulpa de fruta", R.drawable.dulce_fresa , 35.50f,0)
    val d_pina= Product(22,"Xplosion balls frutos tropicales", "INFINY 50gr de dulce de frutos tropicales sin azucar añadadida, 100% pulpa de fruta", R.drawable.dulce_pina , 35.50f, 0)
    val d_mazapan= Product(23,"Mazapán frambuesa/platano", "ANCESTRAL 40gr de mazapan artesanal con trozos de frambuesa y platano deshidrados", R.drawable.dulce_mazapan , 25.00f,0)
    val d_obleas= Product(24,"Choco obleas de amaranto ", "CHOKE OBLEAS 27gr Mini Choco Obleas de Amarantos con relleno de chocolate", R.drawable.dulce_obleas , 19.50f, 0)

    //BOTANAS
    val b_betabel= Product(31,"Chips de betabel adobadas", " SOLEADOS 50gr Betabel horneado con sabor adobado.", R.drawable.botana_betabel , 35.50f, 0)
    val b_cacahuates= Product(32,"Nussnuts cacahuate y semillas de calabaza", "INFINY 60gr de cacahuate y semillas de calabaza horneados con sal de jamaica", R.drawable.botana_cacahuate , 25.90f,0 )
    val b_maiz= Product(33,"Nussnuts granos de maíz enchilados", "INFINY 60gr de grano de maiz horneado con chile piquin seco y sal de jamaica", R.drawable.botana_maiz , 25.90f, 0)
    val b_soles= Product(34,"Soles", "ANCESTRAL 60gr de Dulce enchilado de arandano y dátil", R.drawable.botana_soles , 38.90f, 0)

    //SALSAS
    val s_arandano= Product(41,"Salsa macha con arandano", "ANCESTRAL 250gr de salsa a base de aceite, frutos secos y arandano.", R.drawable.salsa_arandano , 129.90f, 0)
    val s_mango= Product(42,"Salsa macha con mango", "ANCESTRAL 250 gr de salsa a base de aceite, frutos secos, mango y almendra", R.drawable.salsa_mango , 159.00f,0 )
    val s_kiwi= Product(43,"Salsa macha con kiwi", "ANCESTRAL 250gr de salsa a base de aceite, frutos secos, kiwi y avellana", R.drawable.salsa_kiwi , 159.00f, 0)
    val s_original= Product(44,"Salsa macha original", "ANCESTRAL 250gr de salsa a base de aceite y frutos secos", R.drawable.salsa_original , 120.00f, 0)


    val myProducts: MutableList<Product> = mutableListOf(c_almendras, c_avecacao, c_cacaoa, c_pistache,d_fresa, d_pina, d_mazapan, d_obleas, b_betabel, b_cacahuates, b_maiz, b_soles, s_arandano, s_kiwi, s_mango, s_original)

    val myProductsCremas : MutableList<Product> = mutableListOf(c_almendras, c_avecacao, c_cacaoa, c_pistache)
    val myProductsDulces : MutableList<Product> = mutableListOf(d_fresa, d_pina, d_mazapan, d_obleas)
    val myProductsBotanas : MutableList<Product> = mutableListOf(b_betabel, b_cacahuates, b_maiz, b_soles)
    val myProductsSalsas : MutableList<Product> = mutableListOf(s_arandano, s_kiwi, s_mango, s_original)

    val myShoppingCart : MutableList<Product> = mutableListOf()
    val myFavorites : MutableList<Product> = mutableListOf()

    val myProductGroup: MutableList<ProductGroup> = mutableListOf(cremas,dulces,botanas,salsas)
    val myShippings: MutableList<Product> = mutableListOf()

    fun getTotalPrice() : Float{
        var acum = 0.0f
        for(cart in myShoppingCart){
            acum += cart.price * cart.quantity
        }
        return acum
    }
}

