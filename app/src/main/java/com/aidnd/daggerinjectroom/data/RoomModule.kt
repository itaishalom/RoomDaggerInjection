package com.aidnd.daggerinjectroom.data

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomModule(mApplication: Application) {

    private val db: AppDatabase = Room.databaseBuilder(mApplication, AppDatabase::class.java, "db").build()

    @Singleton
    @Provides
    internal fun providesRoomDatabase(): AppDatabase {
        return db
    }

    @Singleton
    @Provides
    fun providesUserDao(db: AppDatabase): UserDao {
        return db.getUserDao()
    }

    @Singleton
    @Provides
    fun userRepository(productDao: UserDao): UserRepository {
        return UserRepository(productDao)
    }
}