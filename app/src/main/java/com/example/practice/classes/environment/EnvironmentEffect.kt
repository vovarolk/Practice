package com.example.practice.classes.environment

abstract class EnvironmentEffect {
    abstract var name: String
    abstract var isActive: Boolean
    abstract var duration: Int
    abstract var intensity: Int

    abstract fun activate(): Unit
    abstract fun deactivate(): Unit
    abstract fun updateEffect(): Unit
    abstract fun render(): Unit
    abstract fun getDurationFun(): Int
}