package com.rromer.exemple.ui.common

import android.app.Activity
import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.rromer.exemple.App
import com.rromer.exemple.common.BaseViewModel
import dagger.android.AndroidInjector
import dagger.android.HasFragmentInjector
/**
 * Created by Rudy Romer on 17/10/2017.
 */
abstract class BaseActivity : AppCompatActivity(), HasFragmentInjector {

    override fun fragmentInjector(): AndroidInjector<Fragment> {
        TODO("not implemented")
    }
    val Activity.app: App get() = application as App

    protected abstract fun getViewModel(): BaseViewModel?


    override fun onPause() {
        super.onPause()
        getViewModel()?.unbind()
    }

    override fun onResume() {
        super.onResume()
        getViewModel()?.bind()
    }
}