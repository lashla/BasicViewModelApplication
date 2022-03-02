package com.example.basicviewmodelapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModelObserver()
        getInput()
    }

    private fun getInput() {
        button.setOnClickListener{
            if (editText.text.isNullOrEmpty()){
                Toast.makeText(this, "Enter Something",Toast.LENGTH_LONG).show()
            } else {
                viewModel.dataInputHandler(editText.text.toString())
                editText.text!!.clear()
            }
        }
    }
    private fun viewModelObserver(){
        viewModel = ViewModelProvider(this)[MyViewModel::class.java]
        viewModel.inputData.observe(this) {
            textView.text = it.toString()
        }
    }
}