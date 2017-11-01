package com.example.database.dao

import android.arch.persistence.room.*
import com.example.database.model.User
import io.reactivex.Flowable

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getAllUsers(): Flowable<List<User>>

    @Query("SELECT * FROM users WHERE id =:id")
    fun getUsersForId(id: Long): Flowable<List<User>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User)

    @Delete
    fun deleteUser(user: User)
}