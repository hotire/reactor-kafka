package com.github.hotire.reactor.kafka

import org.junit.jupiter.api.Test

internal class LoggerDelegateTest {

    private val log by LoggerDelegate()

    @Test
    fun getValue() {
        print("before") // logger is null
        log.info("hello")
    }
}
