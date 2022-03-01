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
        viewModelAction()
        incrementText()
    }

    private fun incrementText() {
        button.setOnClickListener{
            if (editText.text.isNullOrEmpty()){
                Toast.makeText(this, "Enter Something",Toast.LENGTH_LONG).show()
            } else {
                viewModel.inputData.value = editText.text.toString()
                editText.text!!.clear()
            }
        }
    }
    private fun viewModelAction(){
        viewModel = ViewModelProvider(this)[MyViewModel::class.java]
        viewModel.inputData.observe(this, Observer {
            textView.text = it.toString()
        })
    }
}