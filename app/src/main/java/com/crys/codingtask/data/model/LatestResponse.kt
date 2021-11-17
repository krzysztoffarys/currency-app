package com.crys.codingtask.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LatestResponse(
    @Json(name = "base")
    val base: String?,
    @Json(name = "date")
    val date: String?,
    @Json(name = "rates")
    val rates: Rates?,
    @Json(name = "success")
    val success: Boolean?,
    @Json(name = "timestamp")
    val timestamp: Int?
)