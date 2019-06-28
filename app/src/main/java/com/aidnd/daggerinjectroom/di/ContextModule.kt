package com.aidnd.daggerinjectroom.di

import dagger.Module
import android.app.Application
import android.content.Context
import dagger.Binds

@Module
abstract class ContextModule {

    @Binds
    internal abstract fun provideContext(application: Application): Context
}