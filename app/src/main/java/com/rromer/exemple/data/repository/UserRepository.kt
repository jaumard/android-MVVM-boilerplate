package com.rromer.exemple.data.repository

import com.rromer.exemple.data.api.UserApi
import com.rromer.exemple.data.database.dao.UserDao
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by Rudy Romer on 15/10/2017.
 */
class UserRepository @Inject constructor(val userApi: UserApi, userDao: UserDao) {

    fun getUser() : Single<String>{
        return Single.just("user name")
    }
}