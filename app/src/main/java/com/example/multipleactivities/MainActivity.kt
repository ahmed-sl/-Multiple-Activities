package com.example.multipleactivities

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import java.time.Instant

class MainActivity : AppCompatActivity() {
    lateinit var edName: EditText
    lateinit var edAddress: EditText
    lateinit var edLocation: EditText
    lateinit var edEmail: EditText
    lateinit var submit: Button
    lateinit var checkBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edName = findViewById(R.id.edName)
        edAddress = findViewById(R.id.edAddress)
        edLocation = findViewById(R.id.edLocation)
        edEmail = findViewById(R.id.edEmail)
        submit = findViewById(R.id.Submit)
        checkBox = findViewById(R.id.checkBox)
        submit.setOnClickListener {
            if (checkBox.isChecked()) {
                val intent = Intent(this,MainActivity2::class.java)
                intent.putExtra("Name", arrayListOf(edName.text.toString()
                ,edAddress.text.toString(),
                    edLocation.text.toString(),
                    edEmail.text.toString()))
                startActivity(intent)
            } else {
                val builder = AlertDialog.Builder(this)
                with(builder) {
                    setTitle("Warning!!")
                    setMessage("you should click Agree to continuation")
                    setPositiveButton("OK", null)
                    setNegativeButton("CANCEL", null)
                    builder.create().show()
                }
            }
        }
    }
}
