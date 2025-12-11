package com.example.practice.classes;

import com.example.practice.classes.environment.*;

fun main() {

    val sunBless = SunBless()
    sunBless.activate()

    for (i in 1..5) {
        sunBless.updateEffect()
        println("Длительность: ${sunBless.getDurationFun()}")
    }

    sunBless.render()

    val rain = RainDebuff()
    rain.activate()

    rain.render()
    for (i in 1..3) {
        rain.updateEffect()
    }

    val fog = Fog()
    fog.activate()

    for (i in 1..10) {
        fog.updateEffect()
        println("Видимость: ${fog.visibility}%")
    }

    fog.render()
}
