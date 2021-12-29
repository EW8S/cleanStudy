package com.ew8s.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Lesson")
data class Lesson(
    @PrimaryKey var id: Int = 1,
    var lessons: List<Units>
)

data class Units(
    var caption: String,
    var tasks: List<Task>
)

data class Task(
    var en: String,
    var ru: String
)