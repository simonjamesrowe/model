package com.simonjamesrowe.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.time.ZonedDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class Skill(
  val id: String,
  val name: String,
  val createdAt: ZonedDateTime,
  val updatedAt: ZonedDateTime,
  val description: String,
  val rating: Double,
  val order: Int? = null
)
