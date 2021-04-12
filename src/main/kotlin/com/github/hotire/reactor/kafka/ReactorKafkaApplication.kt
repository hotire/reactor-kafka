package com.github.hotire.reactor.kafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactorKafkaApplication

fun main(args: Array<String>) {
    runApplication<ReactorKafkaApplication>(*args)
}
