package com.example.ui.story.mainActivity

import android.arch.lifecycle.ViewModel
import com.example.di.annotation.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainActivityViewModel): ViewModel


    /*@ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment*/

    //here you can inject some necessary object for your activity
    /*@Provides
    fun provideAnService() = AnServicee()*/
}