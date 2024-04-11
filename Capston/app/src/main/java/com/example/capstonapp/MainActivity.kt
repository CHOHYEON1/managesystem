package com.example.capstonapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.capstonapp.databinding.MainBinding


class MainActivity : ComponentActivity() {

    private lateinit var binding: MainBinding


    // 뷰가 생성되었을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //세팅 버튼 뷰에 클릭리스너를 설정
        binding.settingBtn.setOnClickListener {
            onSettingbtnClicked()
        }
    }

    fun onSettingbtnClicked(){
        val intent =  Intent(this, SettingActivity::class.java)

        startActivity(intent)

    }

}

