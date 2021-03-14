package com.simonjamesrowe.model.cms.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import java.time.ZonedDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class WebhookEventDTO(
  val event: String,
  @field:JsonProperty("created_at")
  val createdAt: ZonedDateTime,
  val model: String,
  val entry: JsonNode
)
