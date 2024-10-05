package com.example.gofpatternt.generating.builder

interface Builder {

    fun addBread()

    fun addCucumber()

    fun addMeat()

    fun addTomato()

    fun addCheese()

    fun getResult(): Burger
}