package com.example.gofpatternt.behavioral.memento

class HeroMemento(
    patrons: Int,
    lives: Int
) {
    var mementoPatrons = patrons
        private set

    var mementoLives = lives
        private set
}