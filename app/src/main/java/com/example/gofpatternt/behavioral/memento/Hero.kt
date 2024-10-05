package com.example.gofpatternt.behavioral.memento

import android.util.Log

class Hero {
    private var patrons = 10
    private var lives = 5

    fun shot() {
        if (patrons > 0) {
            patrons--
            Log.e("Hero", "There was a shot. $patrons patrons left")
        } else {
            Log.e("Hero", "There are no more patrons")
        }
    }

    fun saveState(): HeroMemento {
        Log.e("Hero", "Saving the game. Parameters: $patrons patrons, $lives lives")
        return HeroMemento(patrons, lives)
    }

    fun restoreState(memento: HeroMemento) {
        patrons = memento.mementoPatrons
        lives = memento.mementoLives
        Log.e("Hero", "Restoring the game. Parameters: $patrons patrons, $lives lives")
    }
}