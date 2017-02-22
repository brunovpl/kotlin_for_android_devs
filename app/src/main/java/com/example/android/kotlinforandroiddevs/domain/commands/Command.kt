package com.example.android.kotlinforandroiddevs.domain.commands

interface Command<out T> {
    fun execute(): T
}
