package com.ew8s.cleandemo.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ew8s.cleandemo.data.local.model.LessonsLocal

@Database(entities = [LessonsLocal::class], version = 1)
@TypeConverters(DataConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}