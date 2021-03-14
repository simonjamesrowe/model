package com.simonjamesrowe.model.serialization

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.simonjamesrowe.model.cms.dto.WebhookEventDTO
import com.simonjamesrowe.model.config.JacksonConfig
import org.springframework.kafka.support.serializer.JsonDeserializer

class WebhookEventDeserializer : JsonDeserializer<WebhookEventDTO>(
  jacksonObjectMapper().also {
    it.registerModule(JacksonConfig.dateTimeModule())
  }
)
