package com.example.gofpatternt.structural.adapter

import android.util.Log
import com.example.gofpatternt.structural.adapter.interfaces.Transport

class Auto : Transport {

    override fun drive() {
        Log.e("Auto","The car is driving on the road")
    }
}