package com.simonjamesrowe.model.data

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Profile(
  val id: String,
  val name: String,
  val title: String,
  val description: String,
  val location: String,
  val phoneNumber: String,
  val primaryEmail: String,
  val secondaryEmail: String
)
