package com.simonjamesrowe.model.data

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.time.ZonedDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class SkillsGroup(
  val id: String,
  val name: String,
  val createdAt: ZonedDateTime,
  val updatedAt: ZonedDateTime,
  val description: String,
  val rating: Double,
  val order: Int? = null,
  val image: Image,
  val skills: List<Skill>
) : CMSObject
