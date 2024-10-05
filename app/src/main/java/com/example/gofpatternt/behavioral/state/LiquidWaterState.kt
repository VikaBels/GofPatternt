package com.example.gofpatternt.behavioral.state

import android.util.Log

class LiquidWaterState : WaterState {

    override fun heat(water: Water) {
        Log.e("LiquidWaterState","Liquid to gas")
        water.state = GasWaterState()
    }

    override fun frost(water: Water) {
        Log.e("LiquidWaterState","Liquid to ice")
        water.state = SolidWaterState()
    }
}