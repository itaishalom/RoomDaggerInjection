package com.aidnd.daggerinjectroom.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.aidnd.daggerinjectroom.data.User
import com.aidnd.daggerinjectroom.data.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(application: Application) : AndroidViewModel(application) {

    @Inject
    lateinit var userRepository: UserRepository

    fun getAppUsers(): LiveData<List<User>> {
       return userRepository.getUsers()
    }
}
