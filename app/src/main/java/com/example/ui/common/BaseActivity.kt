package com.example.ui.common

import android.app.Activity
import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.example.App
import com.example.common.BaseViewModel
import dagger.android.AndroidInjector
import dagger.android.HasFragmentInjector

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