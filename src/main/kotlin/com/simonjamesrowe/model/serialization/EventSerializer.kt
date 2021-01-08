package com.simonjamesrowe.model.serialization

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

import com.simonjamesrowe.model.data.Event
import com.simonjamesrowe.model.config.JacksonConfig
import org.springframework.kafka.support.serializer.JsonSerializer

class EventSerializer : JsonSerializer<Event>(
  jacksonObjectMapper().also {
    it.registerModule(JacksonConfig.dateTimeModule())
  }
)
