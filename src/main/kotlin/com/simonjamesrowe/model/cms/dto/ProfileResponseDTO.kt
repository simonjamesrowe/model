package com.simonjamesrowe.model.cms.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class ProfileResponseDTO(
  val id: String,
  val name: String,
  val title: String,
  val headline: String,
  val description: String,
  val location: String,
  val phoneNumber: String,
  val primaryEmail: String,
  val secondaryEmail: String
)
