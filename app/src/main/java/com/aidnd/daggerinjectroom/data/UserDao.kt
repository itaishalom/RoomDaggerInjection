
package com.aidnd.daggerinjectroom.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * The Data Access Object for the Plant class.
 */
@Dao
interface UserDao {
    @Query("SELECT * FROM users ORDER BY name")
    fun getUsers(): LiveData<List<User>>

    @Query("SELECT * FROM users WHERE userId = :userId")
    fun getUserById(userId: String): User?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(plants: User)

    @Query("SELECT * FROM users ORDER BY name")
    fun getActiveUsers(): List<User>
}
