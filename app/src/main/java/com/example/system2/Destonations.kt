package com.example.system2

interface Destonations{
    val Route:String
}

object Home: Destonations{
    override val Route= "Home"
}

object Second : Destonations{
    override val Route="Second/{user}/{age}"
}