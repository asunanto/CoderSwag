package com.asunanto.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.asunanto.coderswag.Adapters.CategoryAdapter
import com.asunanto.coderswag.Model.Category
import com.asunanto.coderswag.R
import com.asunanto.coderswag.Services.DataServices
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataServices.categories)

        categoryListView.adapter = adapter
    }
}
