package com.example.gofpatternt.behavioral.memento

import java.util.*

class GameHistory {
    var history: Stack<HeroMemento>? = null
        private set

    init {
        history = Stack()
    }
}