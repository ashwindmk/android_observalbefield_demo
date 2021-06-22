package com.ashwin.android.observalefield

import android.util.Log
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val userField = ObservableField<User>()
    val boolField = ObservableBoolean()

    fun updateUser(user: User) {
        Log.d("observable-field", "updateUser($user)")
        userField.set(user)
    }

    fun updateBoolean(b: Boolean) {
        Log.d("observable-field", "updateBoolean($b)")
        boolField.set(b)
    }
}
