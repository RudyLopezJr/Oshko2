package com.example.oshko2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.oshko2.fragments.HomeFragment
import com.example.oshko2.fragments.ProfileFragment
import com.example.oshko2.fragments.ShoppingCartFragment
import com.example.oshko2.fragments.StarFragment
import kotlinx.android.synthetic.main.activity_home.*

const val USER_NAME = "com.example.oshko2.USER_NAME"

var num = 0
var positionE = 0
var titles = mutableListOf("Cremas", "Dulces", "Salsas", "Botanas")
var tittle = titles[0]
var sizeOfProducts = 4

var products = RegisterProduct()


class HomeActivity : AppCompatActivity() {

    private lateinit var boton: Button
    private lateinit var input: EditText
    private val homeFragment = HomeFragment()
    private val profileFragment = ProfileFragment()
    private val shoppingCartFragment = ShoppingCartFragment()
    private val starFragment = StarFragment()


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        replaceFragment(homeFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> replaceFragment(homeFragment)
                R.id.ic_profile -> replaceFragment(profileFragment)
                R.id.ic_shopping_cart -> replaceFragment(shoppingCartFragment)
                R.id.ic_star -> replaceFragment(starFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}
