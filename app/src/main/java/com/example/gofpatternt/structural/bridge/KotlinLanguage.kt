package com.example.gofpatternt.structural.bridge

import android.util.Log
import com.example.gofpatternt.structural.bridge.interfaces.ProgrammerLanguage

class KotlinLanguage: ProgrammerLanguage {

    override fun build() {
        Log.e("KotlinLanguage","Compilation of Kotlin code")
    }

    override fun execute() {
        Log.e("KotlinLanguage","Launching the Kotlin program file")
    }
}