package com.ew8s.cleandemo.data.local

import androidx.room.*
import com.ew8s.cleandemo.data.local.model.LessonsLocal

@Dao
interface UserDao{

    @Query("SELECT * FROM Lesson")
    fun getAll(): LessonsLocal

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(lessons: LessonsLocal)
}