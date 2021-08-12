package com.example.oshko2

class RegisterUser{
    val usuario1 = User("Alan", "alan@correo.com", "99881207541","alan123", "Alan Pulido")
    val usuario2 = User("Fernanda", "fernanda@correo.com", "99881207542","fernanda123", "Fernanda Flores")
    val usuario3 = User("a","a","a","a", "Jose Vazquez")

    val myUsers: MutableList<User> = mutableListOf(usuario1, usuario2, usuario3)

    fun register(user1: String, pass:String, mail : String , celp : String? , nom : String ) : Boolean{

        for(auxUser in myUsers){
            if( (user1 == auxUser.username || user1 == auxUser.email) && pass == auxUser.password){
                return false
            }
        }

        val usuarioNuevo = User(user1,mail,celp,pass, nom)
        myUsers += usuarioNuevo
        return true

    }

    fun login(user1: String, pass:String): Int{
        var i = 0
        for(auxUser in myUsers){
            if( (user1 == auxUser.username || user1 == auxUser.email) && pass == auxUser.password){
                return i
            }
            i += 1
        }
        return -1
    }
}