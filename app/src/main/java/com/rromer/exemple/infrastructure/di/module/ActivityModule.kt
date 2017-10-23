package com.rromer.exemple.infrastructure.di.module

import android.arch.lifecycle.ViewModelProvider
import com.rromer.exemple.infrastructure.di.ViewModelFactory
import com.rromer.exemple.ui.story.mainActivity.MainActivity
import com.rromer.exemple.ui.story.mainActivity.MainActivityModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Rudy Romer on 02/10/2017.
 */

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity(): MainActivity

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}
