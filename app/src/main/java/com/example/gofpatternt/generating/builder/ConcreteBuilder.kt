package com.example.gofpatternt.generating.builder

class ConcreteBuilder : Builder {
    private val burger = Burger()

    override fun addBread() {
        burger.addIngredient("Bread")
    }

    override fun addCucumber() {
        burger.addIngredient("Cucumber")
    }

    override fun addMeat() {
        burger.addIngredient("Meat")
    }

    override fun addTomato() {
        burger.addIngredient("Tomato")
    }

    override fun addCheese() {
        burger.addIngredient("Cheese")
    }

    override fun getResult(): Burger {
        return burger
    }
}