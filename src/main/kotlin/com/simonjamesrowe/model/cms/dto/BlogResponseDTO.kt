package com.simonjamesrowe.model.cms.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.time.ZonedDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class BlogResponseDTO(
  val id: String,
  val published: Boolean,
  val tags: List<TagResponseDTO>,
  val createdAt: ZonedDateTime,
  val updatedAt: ZonedDateTime,
  val skills: List<SkillResponseDTO>,
  val shortDescription: String,
  val title: String,
  val content: String,
  val image: ImageResponseDTO
) : CMSObject
