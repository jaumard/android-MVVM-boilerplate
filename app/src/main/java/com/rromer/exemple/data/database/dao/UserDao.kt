package com.rromer.exemple.data.database.dao

import android.arch.persistence.room.*
import com.rromer.exemple.data.model.User
import io.reactivex.Flowable

/**
 * Created by Rudy Romer on 19/10/2017.
 */
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