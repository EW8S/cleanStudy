package com.ew8s.cleandemo.data.remote.model

import com.ew8s.cleandemo.domain.model.Lesson
import com.google.gson.annotations.SerializedName

data class Lessons(
    @SerializedName("lessons")
    var lessons: MutableList<Lesson>?,
    @SerializedName("timetamp")
    var timestamp: Double?
)