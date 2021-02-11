package com.simonjamesrowe.model.data

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.time.ZonedDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class Blog(
  val id: String,
  val published: Boolean,
  val tags: List<Tag>,
  val createdAt: ZonedDateTime,
  val updatedAt: ZonedDateTime,
  val skills: List<Skill>,
  val shortDescription: String,
  val title: String,
  val content: String,
  val image: Image
) : CMSObject
