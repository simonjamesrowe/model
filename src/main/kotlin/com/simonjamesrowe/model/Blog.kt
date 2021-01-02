package com.simonjamesrowe.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.time.LocalDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class Blog(
  val id: String,
  val published: Boolean,
  val tags: List<Tag>,
  val createdAt: LocalDateTime,
  val updatedAt: LocalDateTime,
  val skills: List<Skill>,
  val shortDescription: String,
  val title: String,
  val content: String
)
