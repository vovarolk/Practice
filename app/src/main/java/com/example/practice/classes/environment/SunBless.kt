package com.example.practice.classes.environment

class SunBless : EnvironmentEffect() {
    override var name: String = "Благословение Солнца"
    override var isActive: Boolean = false
    override var duration: Int = 600
    override var intensity: Int = 100

    protected var healPerSecond: Int = 5

    override fun activate() {
        isActive = true
        println("☀️ Солнце светит ярко! HP восстанавливается!")
    }

    override fun deactivate() {
        isActive = false
        println("Солнце скрылось за облаками")
    }

    override fun updateEffect() {
        if (isActive && duration > 0) {
            println("Восстановление HP: +$healPerSecond")
            duration -= 1
        }
        if (duration <= 0) deactivate()
    }

    override fun render() {
        println("Экран освещён золотистым светом")
    }

    override fun getDurationFun(): Int = duration
}