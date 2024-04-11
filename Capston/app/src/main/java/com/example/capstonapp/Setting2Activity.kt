package com.example.capstonapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.capstonapp.databinding.Setting2Binding


class Setting2Activity : ComponentActivity() {

    private lateinit var binding:Setting2Binding

    // 뷰가 생성되었을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Setting2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }


    fun onBackBtnClicked(view: View){
        finish()
    }
}

