package com.github.hotire.reactor.kafka

import org.springframework.boot.autoconfigure.kafka.KafkaProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SampleKafkaConfig(private val kafkaProperties: KafkaProperties) {

    val log by LoggerDelegate()

    @Bean
    fun sampleProducer() = SampleProducer(kafkaProperties.buildProducerProperties())
}
