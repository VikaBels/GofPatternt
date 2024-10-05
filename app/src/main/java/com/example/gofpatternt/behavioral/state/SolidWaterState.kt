package com.example.gofpatternt.behavioral.state

import android.util.Log

class SolidWaterState : WaterState {

    override fun heat(water: Water) {
        Log.e("SolidWaterState", "Ice to liquid")
        water.state = LiquidWaterState()
    }

    override fun frost(water: Water) {
        Log.e("SolidWaterState", "Ice freezing")
    }
}