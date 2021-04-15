package com.github.hotire.reactor.kafka

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LoggerDelegate : ReadOnlyProperty<Any, Logger> {
    override fun getValue(thisRef: Any, property: KProperty<*>): Logger = LoggerFactory.getLogger(thisRef.javaClass)
}





