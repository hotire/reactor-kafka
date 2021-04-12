package com.github.hotire.reactor.kafka

import reactor.kafka.sender.KafkaSender
import reactor.kafka.sender.SenderOptions

class SampleProducer(props: Map<String, Any>) : AutoCloseable {
    private val sender: KafkaSender<Int, String> = KafkaSender.create(SenderOptions.create(props))

    fun send(topic: String, message: String) {
        // TODO
    }

    override fun close() {
        sender.close()
    }
}
