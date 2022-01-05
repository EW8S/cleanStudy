package com.ew8s.cleandemo.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ew8s.cleandemo.cleandemo.data.local.UserDao

@Database(entities = [Lesson::class], version = 1)
@TypeConverters(DataConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}