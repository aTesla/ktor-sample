package com.example

import com.example.model.FakeTaskRepository
import com.example.plugins.configureDatabases
import com.example.plugins.configureRouting
import com.example.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val repository = FakeTaskRepository()

    configureSerialization(repository)
    configureDatabases()
    configureRouting(repository)
}
