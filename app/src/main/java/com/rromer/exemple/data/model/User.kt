package com.rromer.exemple.data.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by Rudy Romer on 17/10/2017.
 */
@Entity(tableName = "users")
data class User(
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")
        val id: Long ,
        @ColumnInfo(name = "name")
        val userName: String)