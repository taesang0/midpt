package com.example.login_ts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

private lateinit var database: DatabaseReference
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        next_button.setOnClickListener {
            val intent = Intent(this, move::class.java)
            startActivity(intent)

        }
        button2.setOnClickListener {
            pause.LoadingDialog(this).show()

        }
        button3.setOnClickListener {
            pause.LoadingDialog(this).dismiss()

        }
    }
    private fun startLoading(){
        val handler = Handler()
        handler.postDelayed({ finish() }, 2000)
    }


}