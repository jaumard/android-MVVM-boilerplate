package com.rromer.exemple.infrastructure.di.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

import com.rromer.exemple.infrastructure.di.ViewModelFactory
import com.rromer.exemple.infrastructure.di.annotation.ViewModelKey
import com.rromer.exemple.ui.story.mainActivity.MainActivityViewModel

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by rromer on 21/0/2017.
 */

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    internal abstract fun bindsMainActivityViewModel(mainActivityViewModel: MainActivityViewModel): ViewModel

    @Binds
    internal abstract fun bindsViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}
