package com.simonjamesrowe.model.cms.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.time.LocalDate
import java.time.ZonedDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class JobResponseDTO(
  val id: String,
  val title: String,
  val company: String,
  val companyUrl: String?,
  val shortDescription: String,
  val longDescription: String?,
  val companyImage: ImageResponseDTO,
  val createdAt: ZonedDateTime,
  val updatedAt: ZonedDateTime,
  val startDate: LocalDate,
  val endDate: LocalDate?,
  val includeOnResume: Boolean,
  val education: Boolean,
  val location: String
) : CMSObject
