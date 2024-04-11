package com.example.capstonapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.capstonapp.databinding.SettingBinding


class SettingActivity : ComponentActivity() {

    private lateinit var binding: SettingBinding

    // 뷰가 생성되었을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SettingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //추가옵션 버튼에 클릭 리스너를 설정
        binding.AdditionalOpt.setOnClickListener {
            onSettingbtnClicked()
        }

    }

    fun onSettingbtnClicked(){
        val intent =  Intent(this, Setting2Activity::class.java)

        startActivity(intent)

    }

    fun onBackBtnClicked(view: View){
        finish()
    }
}

