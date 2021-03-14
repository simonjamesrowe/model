package com.simonjamesrowe.model.cms.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.time.ZonedDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class SkillsGroupResponseDTO(
  val id: String,
  val name: String,
  val createdAt: ZonedDateTime,
  val updatedAt: ZonedDateTime,
  val description: String,
  val rating: Double,
  val order: Int? = null,
  val image: ImageResponseDTO,
  val skills: List<SkillResponseDTO>
) : CMSObject
