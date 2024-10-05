package com.example.gofpatternt.structural.bridge

import android.util.Log
import com.example.gofpatternt.structural.bridge.interfaces.ProgrammerLanguage

class JavaLanguage : ProgrammerLanguage {

    override fun build() {
        Log.e("JavaLanguage","Compiling Java code")
    }

    override fun execute() {
        Log.e("JavaLanguage","Launching the Java program file")
    }
}