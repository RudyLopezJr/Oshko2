package com.example.oshko2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.oshko2.CustomAdapter
import com.example.oshko2.CustomAdapter2
import com.example.oshko2.R
import kotlinx.android.synthetic.main.card_layout.*
import kotlinx.android.synthetic.main.card_layout.view.*
import kotlinx.android.synthetic.main.fragment_product.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProductFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProductFragment : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_product, container, false)



        val recyclerView2 = view.findViewById<RecyclerView>(R.id.recyclerView2)
        val adapter = CustomAdapter2()



        view.recyclerView2.layoutManager = LinearLayoutManager(activity)
        recyclerView2.adapter = adapter

        adapter.setOnItemClickListener(object : CustomAdapter2.onItemClickListener{
            override fun onItemClick(position: Int) {

                //description_product.text = "Se ha tocado el elemento"
                addButton.setOnClickListener{
                    quantityToAdd.text = "1"

                    Toast.makeText(activity, "You clicked $position button", Toast.LENGTH_SHORT).show()
                }
                deleteButton.setOnClickListener{
                    quantityToAdd.text = "0"

                }
                Toast.makeText(activity, "You clicked on Item no. $position", Toast.LENGTH_SHORT).show()
            }
        })



        return view
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ProductFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ProductFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}