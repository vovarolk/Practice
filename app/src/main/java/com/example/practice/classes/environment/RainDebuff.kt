package com.example.practice.classes.environment

class RainDebuff : EnvironmentEffect() {

    override var name: String = "Дождевой шторм"
    override var isActive: Boolean = false
    override var duration: Int = 480
    override var intensity: Int = 60

    protected var accuracyPenalty: Int = 25

    override fun activate() {
        isActive = true
        println("🌧️ Начался дождь! Точность снижена на $accuracyPenalty%")
    }

    override fun deactivate() {
        isActive = false
        println("Дождь прекратился")
    }

    override fun updateEffect() {
        if (isActive) {
            println("Идёт дождь... видимость плохая")
            duration -= 1
        }
        if (duration <= 0) deactivate()
    }

    override fun render() {
        println("На экран падают капли дождя")
    }

    override fun getDurationFun(): Int = duration
}