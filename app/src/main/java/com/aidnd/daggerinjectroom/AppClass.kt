package com.aidnd.daggerinjectroom

import com.aidnd.daggerinjectroom.data.RoomModule
import dagger.android.AndroidInjector
import com.aidnd.daggerinjectroom.di.DaggerApplicationComponent

import dagger.android.support.DaggerApplication

class  AppClass : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val component = DaggerApplicationComponent.builder().application(this)
            .roomModule(RoomModule(this)).build()
        component.inject(this)
        return component
    }
}