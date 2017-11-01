package com.example.di.module

import android.arch.persistence.room.Room
import com.example.App
import com.example.data.repository.UserRepository
import com.example.database.GepcDatabase
import com.example.database.dao.UserDao
import com.example.network.api.UserApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule{

    @Singleton
    @Provides
    fun provideContext(application: App) = application.applicationContext

    @Singleton
    @Provides
    fun providesUserRepository(userApi: UserApi, userDao: UserDao) =
            UserRepository(userApi, userDao)


    @Singleton
    @Provides
    fun providesDatabase(application: App)  =
            Room.databaseBuilder(application.applicationContext, GepcDatabase::class.java, "database_name").build()


    @Singleton
    @Provides
    fun providesUserDao(gepcDatabase: GepcDatabase) =  gepcDatabase.userDao()


    @Singleton
    @Provides
    fun providesUserApi() = UserApi()
}