package com.melendez.lastactivitynavigation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var name = MutableLiveData("")
    var lastName = MutableLiveData("")
}