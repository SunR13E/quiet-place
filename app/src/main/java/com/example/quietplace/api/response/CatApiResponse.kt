package com.example.quietplace.api.response

import com.google.gson.annotations.SerializedName

data class CatListItem(
    @SerializedName("id")
    val id: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("width")
    val width: String,
    @SerializedName("height")
    val height: String,
)
