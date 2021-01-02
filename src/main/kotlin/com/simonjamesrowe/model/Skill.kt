package com.simonjamesrowe.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.time.LocalDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class Skill(
  val id: String,
  val name: String,
  val createdAt: LocalDateTime,
  val updatedAt: LocalDateTime,
  val description: String,
  val rating: Double,
  val order: Int? = null
)
