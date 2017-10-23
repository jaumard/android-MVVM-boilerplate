package com.rromer.exemple.ui.story.mainActivity

import android.arch.lifecycle.ViewModelProvider
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.rromer.exemple.R
import com.rromer.exemple.common.BaseViewModel
import com.rromer.exemple.databinding.ActivityMainBinding
import com.rromer.exemple.ui.common.BaseActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

/**
 * Created by Rudy Romer on 17/10/2017.
 */

class MainActivity : BaseActivity() {

    override fun getViewModel(): BaseViewModel {
        return viewModel
    }

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by lazy {
        MainActivityViewModel.create(this, viewModelFactory)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}
