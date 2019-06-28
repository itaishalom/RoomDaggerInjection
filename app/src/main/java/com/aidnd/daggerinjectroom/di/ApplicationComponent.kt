package com.aidnd.daggerinjectroom.di

import android.app.Application
import com.aidnd.daggerinjectroom.AppClass
import com.aidnd.daggerinjectroom.data.AppDatabase
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton
import com.aidnd.daggerinjectroom.data.RoomModule


@Singleton
@Component(modules = [ContextModule::class, ViewModelModule::class, AndroidSupportInjectionModule::class, ActivityBindingModule::class, RoomModule::class])
interface ApplicationComponent : AndroidInjector<DaggerApplication> {

    fun inject(application: AppClass)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun roomModule(roomModule: RoomModule): Builder

        fun build(): ApplicationComponent

    }
}