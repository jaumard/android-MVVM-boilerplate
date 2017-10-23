package com.rromer.exemple.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.rromer.exemple.data.database.dao.UserDao
import com.rromer.exemple.data.model.User

/**
 * Created by Rudy Romer on 19/10/2017.
 */

@Database(entities = arrayOf(User::class), version = 1)
abstract class GepcDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}