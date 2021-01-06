package com.example.test

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModel : ViewModel() {
    val liveData = MutableLiveData<String>()
}