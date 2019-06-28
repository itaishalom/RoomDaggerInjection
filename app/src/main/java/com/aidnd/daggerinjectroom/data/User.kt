package com.aidnd.daggerinjectroom.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey  var userId: String,
    @ColumnInfo(name = "name") var name: String? = null,
    @ColumnInfo(name = "email") var email: String? = null
) {

    override fun toString(): String {
        return "User(userId='$userId', name=$name, email=$email"
    }
}
