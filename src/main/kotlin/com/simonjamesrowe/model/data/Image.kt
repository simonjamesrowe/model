package com.simonjamesrowe.model.data

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Image(
  val url: String,
  val name: String,
  val size: Int,
  val width: Int,
  val height: Int,
  val mime: String,
  val formats: ImageFormats?
) {
  @JsonIgnoreProperties(ignoreUnknown = true)
  data class ImageFormats(
    val thumbnail: Image?,
    val large: Image?,
    val medium: Image?,
    val small: Image?
  )
}
