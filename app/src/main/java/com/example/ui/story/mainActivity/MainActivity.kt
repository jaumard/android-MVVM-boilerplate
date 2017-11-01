package com.example.ui.story.mainActivity

import android.arch.lifecycle.ViewModelProvider
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.example.R
import com.example.common.BaseViewModel
import com.example.databinding.ActivityMainBinding
import com.example.ui.common.BaseActivity
import dagger.android.AndroidInjection
import javax.inject.Inject


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
