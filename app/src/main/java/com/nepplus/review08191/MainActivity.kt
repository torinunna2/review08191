package com.nepplus.review08191

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

//            1. 입력한 아이디와 비번 추출, (변수 저장)

            val inputId = idEdt.text.toString()
            val inputPw = passwordEdt.text.toString()

//            2. 입력한 아이디와 비번 검사

            if ( inputId == "admin" && inputPw == "qwer") {
                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT)
            }

//            로그인 성공.

            else {
                Toast.makeText(this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT)
            }

//            로그인 실패.


        }

    }
}