package com.example.gofpatternt.behavioral.state

class Water(waterState: WaterState) {
    var state = waterState

    fun heat() {
        state.heat(this)
    }

    fun frost() {
        state.frost(this)
    }
}