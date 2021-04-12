package com.github.hotire.reactor.kafka

import reactor.kafka.sender.KafkaSender
import reactor.kafka.sender.SenderOptions

class SampleProducer(props: Map<String, Any>) {
    private val sender: KafkaSender<Int, String> = KafkaSender.create(SenderOptions.create(props))
}
