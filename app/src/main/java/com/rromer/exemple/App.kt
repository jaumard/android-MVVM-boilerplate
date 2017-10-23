package com.rromer.exemple

import android.app.Activity
import android.app.Application
import com.rromer.exemple.infrastructure.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by Rudy Romer on 01/10/2017.
 */
class App : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().create(this).inject(this);
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}