package com.ew8s.cleandemo.data.remote.model

import com.google.gson.annotations.SerializedName

data class Lessons(
    @SerializedName("lessons")
    var lessons: List<Lesson>,
    @SerializedName("timetamp")
    var timetamp: Long
)

data class Lesson(
    @SerializedName("caption")
    var caption: String,
    @SerializedName("tasks")
    var tasks: List<Task>
)

data class Task(
    @SerializedName("en")
    var en: String,
    @SerializedName("ru")
    var ru: String
)