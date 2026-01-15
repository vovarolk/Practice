package com.example.practice.classes.environment

class Fog : EnvironmentEffect() {

    override var name: String = "Туман"
    override var isActive: Boolean = false
    override var duration: Int = 300
    override var intensity: Int = 50

    var visibility: Int = 30

    override fun activate() {
        isActive = true
        visibility = 30
        println("🌫️ На карте появился плотный туман!")
    }

    override fun deactivate() {
        isActive = false
        println("Туман рассеялся")
    }

    override fun updateEffect() {
        if (isActive) {
            visibility += 5
            println("Видимость улучшается: ${visibility}%")
            duration -= 1


            if (visibility >= 100) deactivate()
        }
        if (duration <= 0) deactivate()
    }

    override fun render() {
        println("На экране видна серая дымка, видимость: ${visibility}%")
    }

    override fun getDurationFun(): Int = duration
}