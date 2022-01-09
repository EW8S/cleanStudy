package com.ew8s.cleandemo.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ew8s.cleandemo.domain.model.Lesson

@Entity(tableName = "Lesson")
data class LessonsLocal(
    @PrimaryKey var id: Int = 1,
    var timetamp: Double?,
    var lessons: MutableList<Lesson>?
)