package com.simonjamesrowe.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.module.kotlin.convertValue
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.simonjamesrowe.model.EventUtils.MODEL_BLOG
import java.time.ZonedDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class Event(
  val event: String,
  @field:JsonProperty("created_at")
  val createdAt: ZonedDateTime,
  val model: String,
  val entry: JsonNode
) {

  fun getEntryObject() : Any? {
    if (model == MODEL_BLOG) {
      return jacksonObjectMapper().convertValue<Blog>(entry)
    }
    return null
  }
}
