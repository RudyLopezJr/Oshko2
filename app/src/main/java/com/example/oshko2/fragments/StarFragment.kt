package com.example.oshko2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.oshko2.*
import kotlinx.android.synthetic.main.fragment_star.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [StarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StarFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_star, container, false)

        //view.starFragment.text = "Hay ${products.myFavorites.size}"
        
        if(products.myFavorites.size > 0){
            val recyclerView4 = view.findViewById<RecyclerView>(R.id.recyclerView4)
            val adapter = CustomAdapter4()

            view.recyclerView4.layoutManager = LinearLayoutManager(activity)
            recyclerView4.adapter = adapter

            var boolStar = false

            adapter.setOnItemClickListener(object : CustomAdapter4.onItemClickListener{
                override fun onItemClick(position: Int) {

                }

                override fun onImageAddClick(position: Int, button: ImageView, text: TextView, precioText: TextView) {
                    var aux1  = text.text.toString().toInt()
                    aux1 += 1
                    text.text = "$aux1"

                    precioText.setText("${aux1.toFloat() * products.myFavorites[position].price}" )
                }

                override fun onImageDeleteClick(position: Int, button: ImageView, text: TextView, precioText: TextView) {
                    var aux1  = text.text.toString().toInt()
                    if(aux1 > 0)
                        aux1 -= 1
                    text.text = "$aux1"
                    precioText.setText("${aux1.toFloat() * products.myFavorites[position].price}" )
                }

                override fun onStarSelected(position: Int, button: ImageView) {
                    var positionEF = positionE * sizeOfProducts
                    if(!boolStar){
                        getContext()?.getResources()?.getColor(R.color.auxiliarColor1)?.let {
                            button.setColorFilter(
                                it
                            )
                        };

                        products.myFavorites.removeAt(position)

                        Toast.makeText(activity, "Se ha desagregado de favoritos", Toast.LENGTH_SHORT).show()
                        boolStar = true

                        changeFragment(StarFragment())
                    }
                    else{
                        getContext()?.getResources()?.getColor(R.color.auxiliarColor2)?.let {
                            button.setColorFilter(
                                it
                            )
                        };

                        var aux2 = false

                        for(favorite in products.myFavorites){
                            if(products.myProducts[position + positionEF].id == favorite.id){
                                aux2 = true
                            }
                        }
                        if(!aux2){
                            val aux3 = products.myProducts[position + positionEF]
                            products.myShoppingCart.add(aux3)
                        }

                        Toast.makeText(activity, "Se ha agregado a favoritos", Toast.LENGTH_SHORT).show()
                        boolStar = false
                    }
                }

                override fun onButtonSelected(position: Int, text: TextView, precioText: TextView) {
                    var aux1 = text.text.toString().toInt()
                    var aux2 = products.myFavorites[position]
                    aux2.quantity += aux1
                    products.addProduct(aux2)
                    text.text = "1"
                    precioText.setText("${products.myFavorites[position].price}")
                }


            })
        }



        return view
    }

    fun changeFragment(fragment: Fragment){
        var fr = getFragmentManager()?.beginTransaction()
        fr?.replace(R.id.fragment_container, fragment)
        fr?.commit()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment StarFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            StarFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}