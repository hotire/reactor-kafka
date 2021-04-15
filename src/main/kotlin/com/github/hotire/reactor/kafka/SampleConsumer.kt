package com.github.hotire.reactor.kafka

import reactor.kafka.receiver.ReceiverOptions

class SampleConsumer(props: Map<String, Any>) {
    private val receiverOptions: ReceiverOptions<Int, String> = ReceiverOptions.create(props)

    fun consume(topic: String) {
        // TODO
    }
}
