package com.example.assignmentfinal.SecondScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentfinal.SecondScreen.recyclerviewComponents.InfoScreenRecyclerAdapter

class InfoActivity : AppCompatActivity() {

    val infoRecyclerview: RecyclerView by lazy {
        findViewById(R.id.infoScreenRecyclerview)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        val dataList = listOf<String>("test","test","test")
        infoRecyclerview.adapter = InfoScreenRecyclerAdapter(dataList)
    }
}