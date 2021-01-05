package com.simonjamesrowe.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.ZonedDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class Tag(
  val id: String,
  val name: String,
  val createdAt: ZonedDateTime,
  val updatedAt: ZonedDateTime,
  @field:JsonProperty("__v")
  val version: Int
)
