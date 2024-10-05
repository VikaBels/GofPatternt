package com.example.gofpatternt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.gofpatternt.behavioral.memento.GameHistory
import com.example.gofpatternt.behavioral.memento.Hero
import com.example.gofpatternt.behavioral.state.LiquidWaterState
import com.example.gofpatternt.behavioral.state.Water
import com.example.gofpatternt.structural.bridge.CorporateProgrammer
import com.example.gofpatternt.structural.bridge.interfaces.ProgrammerLanguage
import com.example.gofpatternt.generating.builder.ConcreteBuilder
import com.example.gofpatternt.generating.builder.Director
import com.example.gofpatternt.generating.factoryMethod.PanelDeveloper
import com.example.gofpatternt.generating.factoryMethod.WoodDeveloper
import com.example.gofpatternt.structural.adapter.Adapter
import com.example.gofpatternt.structural.adapter.Auto
import com.example.gofpatternt.structural.adapter.Camel
import com.example.gofpatternt.structural.adapter.Driver

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Generating patterns
        //builder()
        //factoryMethod()

        //Structural patterns
        //bridge(KotlinLanguage())
        //adapter()

        //Behavioral patterns
        //memento()
        //state()
    }

    //Generating patterns
    private fun builder() {
        val builder = ConcreteBuilder()
        Director(builder).createVeganBurger()

        val burger = builder.getResult()
        burger.getBurgerInformation()
    }

    private fun factoryMethod() {
        val panelDeveloper = PanelDeveloper()
        val houseOne = panelDeveloper.createHouse()
        Log.e("MainActivity", houseOne.getNameHouse())

        val woodDeveloper = WoodDeveloper()
        val houseTwo = woodDeveloper.createHouse()
        Log.e("MainActivity", houseTwo.getNameHouse())
    }

    //Structural patterns
    private fun bridge(language: ProgrammerLanguage) {
        val programmer = CorporateProgrammer(language)
        programmer.apply {
            doWork()
            earnMoney()
        }
    }

    private fun adapter() {
        val driver = Driver()
        val adapter = Adapter(Camel())

        driver.apply {
            travel(Auto())
            travel(adapter)
        }
    }

    //Behavioral patterns
    private fun memento() {
        val gameHistory = GameHistory()
        val hero = Hero()

        hero.shot()
        gameHistory.history?.push(hero.saveState())

        hero.apply {
            shot()
            shot()
        }
        gameHistory.history?.pop()?.let { hero.restoreState(it) }

        hero.shot()
    }

    private fun state() {
        val water = Water(LiquidWaterState())

        water.apply {
            heat()
            frost()
            frost()
        }
    }
}