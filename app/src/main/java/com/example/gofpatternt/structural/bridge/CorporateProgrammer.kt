package com.example.gofpatternt.structural.bridge

import android.util.Log
import com.example.gofpatternt.structural.bridge.interfaces.Programmer
import com.example.gofpatternt.structural.bridge.interfaces.ProgrammerLanguage

class CorporateProgrammer(
    private val language: ProgrammerLanguage
) : Programmer {

    override fun doWork() {
        language.apply {
            build()
            execute()
        }
    }

    override fun earnMoney() {
        Log.e("CorporateProgrammer", "Receiving money at the end of the month")
    }
}