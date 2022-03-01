package com.example.basicviewmodelapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class MyViewModel: ViewModel() {
    var input = ""
    val inputData: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
}