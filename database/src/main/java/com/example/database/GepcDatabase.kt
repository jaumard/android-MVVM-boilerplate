package com.example.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.database.dao.UserDao
import com.example.database.model.User

@Database(entities = arrayOf(User::class), version = 1)
abstract class GepcDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}