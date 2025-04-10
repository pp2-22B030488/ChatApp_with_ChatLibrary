package com.example.chatapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chatlibrary.ChatLibrary

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val chatLibrary = ChatLibrary()
        chatLibrary.start(this)
    }
}
