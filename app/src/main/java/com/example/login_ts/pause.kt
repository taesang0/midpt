package com.example.login_ts

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_pause.*

class pause : AppCompatActivity() {
    class LoadingDialog

    constructor(context: Context) : Dialog(context){

        init {
       //     setCanceledOnTouchOutside(false)

            window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            setContentView(R.layout.activity_pause)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pause)
        button.setOnClickListener {
            pause.LoadingDialog(this).dismiss()

        }
    }


}