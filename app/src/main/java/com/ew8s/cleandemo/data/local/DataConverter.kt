package com.ew8s.cleandemo.data.local

import androidx.room.TypeConverter
import com.google.gson.Gson

class DataConverter {
    @TypeConverter
    fun fromLessons(lessons: List<Units>?): String? {
        if (lessons == null) {
            return null
        }
        val gson = Gson()
        return gson.toJson(lessons)
    }

    @TypeConverter
    fun toLessons(lessons: String?): List<Units>? {
        if (lessons == null) {
            return null
        }
        return Gson().fromJson(lessons, Array<Units>::class.java).toList()
    }
}