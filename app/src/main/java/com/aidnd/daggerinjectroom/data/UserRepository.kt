package com.aidnd.daggerinjectroom.data


/**
 * Repository module for handling data operations.
 */
class UserRepository constructor(private val userDao: UserDao) {

    fun getUsers() = userDao.getUsers()

    fun getUserById(plantId: String): User? {
        return userDao.getUserById(plantId)
    }

    fun insert(user: User) {
        userDao.insert(user)
    }
}