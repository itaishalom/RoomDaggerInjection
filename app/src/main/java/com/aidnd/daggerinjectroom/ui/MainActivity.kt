package com.aidnd.daggerinjectroom.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.aidnd.daggerinjectroom.R
import com.aidnd.daggerinjectroom.viewModels.MainViewModel
import com.aidnd.daggerinjectroom.viewModels.ViewModelFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
    }
}
