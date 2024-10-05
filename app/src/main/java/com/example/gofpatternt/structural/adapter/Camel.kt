package com.example.gofpatternt.structural.adapter

import android.util.Log
import com.example.gofpatternt.structural.adapter.interfaces.Animal

class Camel : Animal {

    override fun move() {
        Log.e("Camel","A camel walks on the desert sands")
    }
}