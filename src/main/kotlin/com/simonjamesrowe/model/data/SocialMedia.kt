package com.simonjamesrowe.model.data

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class SocialMedia(
  val id: String,
  val type: String,
  val link: String,
  val name: String,
  val includeOnResume: Boolean
)
