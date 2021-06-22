package com.ashwin.android.observalefield

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class User : BaseObservable() {
    @get:Bindable
    var name: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    @get:Bindable
    var email: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.email)
        }

    override fun toString(): String {
        return "User{name: $name, email: $email}"
    }
}
