package com.example.contentdmoclass

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var edtName: TextView
    lateinit var btnSend: Button
    lateinit var txtPersonName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        edtName = findViewById(R.id.etd_name)
        btnSend = findViewById(R.id.btn_send)
        txtPersonName = findViewById(R.id.person_name)

        btnSend.setOnClickListener(View.OnClickListener {
            val personName: String = edtName.text.toString()
            txtPersonName.text = personName
        })

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}