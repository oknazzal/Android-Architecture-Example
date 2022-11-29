package com.oknazzal.architecture.example.core.errorhandler.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class HttpErrorBodyModel(

    @Json(name = "name")
    val name: String? = null,

    @Json(name = "header")
    val header: String? = null,

    @Json(name = "message")
    val message: String? = null
)
