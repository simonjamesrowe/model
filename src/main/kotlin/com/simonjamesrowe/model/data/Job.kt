package com.simonjamesrowe.model.data

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.time.LocalDate
import java.time.ZonedDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class Job(
  val id: String,
  val title: String,
  val company: String,
  val companyUrl: String?,
  val shortDescription: String,
  val longDescription: String?,
  val companyImage: Image,
  val createdAt: ZonedDateTime,
  val updatedAt: ZonedDateTime,
  val startDate: LocalDate,
  val endDate: LocalDate?,
  val includeOnResume: Boolean,
  val education: Boolean
) : CMSObject
