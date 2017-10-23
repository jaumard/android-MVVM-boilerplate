package com.rromer.exemple.infrastructure.di.module

import android.arch.persistence.room.Room
import com.rromer.exemple.App
import com.rromer.exemple.data.api.UserApi
import com.rromer.exemple.data.database.GepcDatabase
import com.rromer.exemple.data.database.dao.UserDao
import com.rromer.exemple.data.repository.UserRepository
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