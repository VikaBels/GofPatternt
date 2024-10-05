package com.example.gofpatternt.generating.factoryMethod

import com.example.gofpatternt.generating.factoryMethod.interfaces.House
import com.example.gofpatternt.generating.factoryMethod.PanelHouse
import com.example.gofpatternt.generating.factoryMethod.interfaces.Developer

class PanelDeveloper : Developer {

    override fun createHouse(): House {
        return PanelHouse()
    }
}