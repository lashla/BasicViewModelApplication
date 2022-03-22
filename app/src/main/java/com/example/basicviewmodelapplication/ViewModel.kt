package com.example.basicviewmodelapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class MyViewModel: ViewModel() {

    val inputData: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    fun setLiveDataValue(input: String) {
        inputData.value = input
    }
}