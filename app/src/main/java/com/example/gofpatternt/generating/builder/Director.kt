package com.example.gofpatternt.generating.builder

class Director(private val builder: Builder) {

    fun createVeganBurger() {
        builder.apply {
            addBread()
            addCheese()
            addTomato()
            addCucumber()
        }
    }

    fun createStandardBurger() {
        builder.apply {
            addBread()
            addMeat()
            addCheese()
            addTomato()
        }
    }
}