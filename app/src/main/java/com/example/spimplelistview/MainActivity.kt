package com.example.spimplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.list_view)

        val names = arrayOf("Kenya", "Uganda", "Tanzania", "Rwanda", "Burundi")

        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)

        listview.adapter = arrayAdapter

        listview.setOnItemClickListener{parent, view, position, id ->
            Toast.makeText(this, "Clicked!" +names[position], Toast.LENGTH_LONG).show()
        }

    }
}