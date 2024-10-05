package com.example.gofpatternt.structural.adapter

import com.example.gofpatternt.structural.adapter.interfaces.Transport

class Adapter(
    private val camel: Camel
) : Transport {

    override fun drive() {
        camel.move()
    }
}