package com.example.ploi003

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recycleview : RecyclerView? = null
    var foodMenuText = arrayOf(
        "SEVENTEEN OFFICIAL LIGHT STICK VER.2",
        "(G)I-DLE OFFICIAL LIGHT STICK",
        "UP10TION OFFICIAL LIGHT STICK",
        "PARK JI HOON OFFICIAL LIGHT STICK",
        "SUPER JUNIOR OFFICIAL LIGHTSTICK VER 2.0",
        "WAYV OFFICIAL FANLIGHT - OFFICIAL LIGHTSTICK",
        "SUNMI OFFICIAL LIGHT STICK",
        "TWICE - OFFICIAL LIGHTSTICK CANDY BONG Z",
        "MONSTA X OFFICIAL LIGHTSTICK VER. 2",
        "GOT7 2018 VER 2 OFFICIAL LIGHT STICK",
        "EXO OFFICIAL LIGHTSTICK VER 3.0",
        "AB6IX OFFICIAL FANLIGHT",
        "STRAY KIDS UNVEIL FANLIGHT"
    )
    var foodMenuImage = arrayOf<Int>(
        R.drawable.pic1,
        R.drawable.pic2,
        R.drawable.pic3,
        R.drawable.pic4,
        R.drawable.pic5,
        R.drawable.pic6,
        R.drawable.pic7,
        R.drawable.pic8,
        R.drawable.pic9,
        R.drawable.pic10,
        R.drawable.pic11,
        R.drawable.pic12,
        R.drawable.pic13
    )
    var context :Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleview = findViewById(R.id.menuRecycleview) as RecyclerView
        recycleview!!.layoutManager = LinearLayoutManager(context)
        recycleview!!.setLayoutManager(GridLayoutManager(context, 2))
        var myAdapter = MyAdapterRecycleview(foodMenuText,foodMenuImage,context)
        recycleview!!.adapter = myAdapter
    }
}
