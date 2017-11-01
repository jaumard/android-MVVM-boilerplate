package com.example.di.module

import android.arch.lifecycle.ViewModelProvider
import com.example.di.ViewModelFactory
import com.example.ui.story.mainActivity.MainActivity
import com.example.ui.story.mainActivity.MainActivityModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity(): MainActivity

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}
