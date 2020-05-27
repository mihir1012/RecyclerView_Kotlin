package com.mihir1012.recyclerviewkotline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_list.adapter = ExampleAdapter(generateDummyList(100))
        recycler_list.layoutManager = LinearLayoutManager(this)
        recycler_list.setHasFixedSize(true)

    }

    private fun generateDummyList(size: Int):List<ExampleItem> {
        val list = ArrayList<ExampleItem>()

        for( i in  0 until size){
            val drawable = when( i % 3){
                0 -> R.drawable.ic_android
                1 -> R.drawable.ic_audiotrack
                else -> R.drawable.ic_looks_3
            }

            val item = ExampleItem(drawable , "item $i", "Line 2")
            list += item
        }

        return list
    }
}
