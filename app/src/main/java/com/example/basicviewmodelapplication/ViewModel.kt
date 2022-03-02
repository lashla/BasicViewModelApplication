package com.example.basicviewmodelapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class MyViewModel: ViewModel() {

    val inputData: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    fun dataInputHandler(input: String) {
        inputData.value = input
    }
}