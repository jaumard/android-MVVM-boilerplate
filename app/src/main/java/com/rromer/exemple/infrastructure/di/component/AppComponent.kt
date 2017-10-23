package com.rromer.exemple.infrastructure.di.component

import dagger.Component
import com.rromer.exemple.App
import com.rromer.exemple.infrastructure.di.module.ActivityModule
import com.rromer.exemple.infrastructure.di.module.AppModule
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

/**
 * Created by Rudy Romer on 17/10/2017.
 */
@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class, AppModule::class, ActivityModule::class))
interface AppComponent: AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()

    override fun inject(app: App)
}
