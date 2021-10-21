package com.example.multipleactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {
    lateinit var rcv : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        rcv = findViewById(R.id.rcv)

        var name = intent.getStringArrayListExtra("Data")


        rcv.adapter=rvAdaptar(name!!)
        rcv.layoutManager= LinearLayoutManager(this)
        rcv.adapter?.notifyDataSetChanged()

    }
}