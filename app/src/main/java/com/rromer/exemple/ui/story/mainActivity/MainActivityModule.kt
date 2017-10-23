package com.rromer.exemple.ui.story.mainActivity

import android.arch.lifecycle.ViewModel
import com.rromer.exemple.infrastructure.di.annotation.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by Rudy Romer on 17/10/2017.
 */
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