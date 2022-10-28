package com.example.login_ts

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_move.*

class move : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)
        val num : TextView = findViewById<TextView>(R.id.humi_text)
        val num1 : Button = findViewById<Button>(R.id.plus_btn)

        var number = num.text.toString().toInt()

        home_btn.setOnClickListener {
            finish()
        }
        minus_btn.setOnClickListener{
            number-=5
            num.setText("$number")
//            num.setText(num1.text)
        }
        plus_btn.setOnClickListener {
            number+=5
            num.setText("$number")
        }
        save_btn.setOnClickListener{
            var builder = AlertDialog.Builder(this)
            builder.setTitle("check")
            builder.setMessage("Are you sure? Humidity: $number")
            builder.setIcon(androidx.constraintlayout.widget.R.drawable.abc_btn_check_material)

            // 버튼 클릭시에 무슨 작업을 할 것인가!
            var listener = DialogInterface.OnClickListener { _, p1 ->
                when (p1) {
                    DialogInterface.BUTTON_POSITIVE ->
                        Toast.makeText(this,"save",Toast.LENGTH_SHORT).show()
                    DialogInterface.BUTTON_NEGATIVE ->
                        Toast.makeText(this,"cancel",Toast.LENGTH_SHORT).show()

                }
            }

            builder.setPositiveButton("예", listener)
            builder.setNegativeButton("아니오", listener)

            builder.show()
        }
    }
}

