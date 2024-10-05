package com.example.gofpatternt.behavioral.state

import android.util.Log

class GasWaterState : WaterState {

    override fun heat(water: Water) {
        Log.e("GasWaterState", "Raising the steam temperature")
    }

    override fun frost(water: Water) {
        Log.e("GasWaterState", "Gas to liquid")
        water.state = LiquidWaterState()
    }
}