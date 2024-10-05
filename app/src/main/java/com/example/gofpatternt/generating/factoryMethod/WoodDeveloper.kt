package com.example.gofpatternt.generating.factoryMethod

import com.example.gofpatternt.generating.factoryMethod.interfaces.House
import com.example.gofpatternt.generating.factoryMethod.WoodHouse
import com.example.gofpatternt.generating.factoryMethod.interfaces.Developer

class WoodDeveloper : Developer {

    override fun createHouse(): House {
        return WoodHouse()
    }
}