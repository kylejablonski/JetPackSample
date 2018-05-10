package com.example.kylejablonski.jetpacksample.ui.main

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val _data = MutableLiveData<List<String>>()
    val data: LiveData<List<String>>
    get() = _data

    init {
        _data.value = arrayListOf("Apples", "Bananas", "Grapes", "Pears", "Strawberries", "Raspberries", "Cantaloupe")
    }
}
