package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {

    private val viewModel: DataViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.firstFragment, FirstFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.secondFragment, SecondFragment())
            .commit()

        viewModel.liveData.value = "Xiaomi top"
    }
}