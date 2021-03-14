package com.simonjamesrowe.model.cms.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class SocialMediaRepsonseDTO(
  val id: String,
  val type: String,
  val link: String,
  val name: String,
  val includeOnResume: Boolean
)
