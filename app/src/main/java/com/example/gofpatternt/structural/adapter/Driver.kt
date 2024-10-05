package com.example.gofpatternt.structural.adapter

import com.example.gofpatternt.structural.adapter.interfaces.Transport

class Driver {

    fun travel(transport: Transport) {
        transport.drive()
    }
}