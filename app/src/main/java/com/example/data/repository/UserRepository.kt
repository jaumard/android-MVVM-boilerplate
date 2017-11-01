package com.example.data.repository

import com.example.database.dao.UserDao
import com.example.network.api.UserApi
import io.reactivex.Single
import javax.inject.Inject

class UserRepository @Inject constructor(val userApi: UserApi, userDao: UserDao) {

    fun getUser() : Single<String>{
        return Single.just("user name")
    }
}