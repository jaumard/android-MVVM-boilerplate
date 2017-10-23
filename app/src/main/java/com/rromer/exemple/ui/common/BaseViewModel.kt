package com.rromer.exemple.common

import android.arch.lifecycle.ViewModel
import android.support.annotation.CallSuper
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by Rudy Romer on 06/10/2017.
 */
open class BaseViewModel :ViewModel(){

    protected var subscriptions: CompositeDisposable? = null

    @CallSuper
    open fun bind() {
        unbind()
        subscriptions = CompositeDisposable()
    }

    @CallSuper
    open fun unbind() {
        subscriptions?.dispose()
        subscriptions = null
    }
}