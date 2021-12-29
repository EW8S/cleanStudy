package com.ew8s.cleandemo.presentation.models


import com.google.gson.annotations.SerializedName

data class ModelLessonItem(
    @SerializedName("en")
    var en: String?,
    @SerializedName("ru")
    var ru: String?
)