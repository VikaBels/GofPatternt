package com.example.gofpatternt.generating.builder

import android.util.Log

class Burger {
    private val listIngredient = mutableListOf<String>()

    fun addIngredient(ingredient: String) {
        listIngredient.add(ingredient)
    }

    fun getBurgerInformation() {
        listIngredient.forEach { ingredient ->
            Log.e("Product", ingredient)
        }
    }
}