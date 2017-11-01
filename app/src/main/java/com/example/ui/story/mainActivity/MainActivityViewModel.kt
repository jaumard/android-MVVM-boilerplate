package com.example.ui.story.mainActivity

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.ObservableField
import com.example.common.BaseViewModel
import com.example.data.repository.UserRepository
import com.example.ui.common.BaseActivity
import timber.log.Timber
import javax.inject.Inject

class MainActivityViewModel @Inject constructor( var userRepository: UserRepository): BaseViewModel(){

    val textValue = ObservableField<String>("no data")

    companion object{
        fun create(activity: BaseActivity, viewModelFactory: ViewModelProvider.Factory): MainActivityViewModel {
            return ViewModelProviders.of(activity, viewModelFactory).get(MainActivityViewModel::class.java)
        }
    }

    fun onResume(){
        subscriptions?.add(userRepository.getUser().subscribe(textValue::set, Timber::e))
    }

}