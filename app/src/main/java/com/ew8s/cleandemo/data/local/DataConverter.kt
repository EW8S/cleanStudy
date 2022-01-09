package com.ew8s.cleandemo.data.local

import androidx.room.TypeConverter
import com.ew8s.cleandemo.domain.model.Lesson
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class DataConverter {
    @TypeConverter
    fun fromLessons(lessons: List<Lesson>?): String? {
        if (lessons == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<Lesson>>() {}.type
        return gson.toJson(lessons, type)
    }

    @TypeConverter
    fun toCountryLangList(countryLangString: String?): List<Lesson>? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<List<Lesson>>() {}.type
        return gson.fromJson<List<Lesson>>(countryLangString, type)
    }
}