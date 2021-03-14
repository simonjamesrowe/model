package com.simonjamesrowe.model.serialization

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

import com.simonjamesrowe.model.cms.dto.WebhookEventDTO
import com.simonjamesrowe.model.config.JacksonConfig
import org.springframework.kafka.support.serializer.JsonSerializer

class WebhookEventSerializer : JsonSerializer<WebhookEventDTO>(
  jacksonObjectMapper().also {
    it.registerModule(JacksonConfig.dateTimeModule())
  }
)
