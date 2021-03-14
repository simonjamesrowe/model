package com.simonjamesrowe.model.cms.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class ImageResponseDTO(
  val url: String,
  val name: String?,
  val size: Int,
  val width: Int,
  val height: Int,
  val mime: String,
  val formats: ImageFormats?
) {
  @JsonIgnoreProperties(ignoreUnknown = true)
  data class ImageFormats(
    val thumbnail: ImageResponseDTO?,
    val large: ImageResponseDTO?,
    val medium: ImageResponseDTO?,
    val small: ImageResponseDTO?
  )
}
