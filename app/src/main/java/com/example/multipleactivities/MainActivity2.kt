package com.example.multipleactivities

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    lateinit var txtNmae: TextView
    lateinit var txtAddress: TextView
    lateinit var txtLocation: TextView
    lateinit var txtemail: TextView
    lateinit var conform: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        txtNmae = findViewById(R.id.txtName)
        txtAddress = findViewById(R.id.txtAddress)
        txtLocation = findViewById(R.id.txtLocation)
        txtemail = findViewById(R.id.txtEmail)
        conform = findViewById(R.id.conform)

        var name = intent.getStringArrayListExtra("Name")

        txtNmae.text="${name!![0]}"
        txtAddress.text="${name!![1]}"
        txtLocation.text="${name!![2]}"
        txtemail.text="${name!![3]}"
        conform.setOnClickListener {

            val intent2 = Intent(this,MainActivity3::class.java)
            intent2.putExtra("Data",name)
            startActivity(intent2)
        }

    }

}