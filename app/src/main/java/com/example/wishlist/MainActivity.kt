package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var itemList: MutableList<Item>
    lateinit var wishlistRv: RecyclerView

    lateinit var itemET: EditText
    lateinit var urlET: EditText
    lateinit var priceNum: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wishlistRv = findViewById(R.id.wishlistRv)

        itemET = findViewById(R.id.itemEt)
        urlET = findViewById(R.id.urlEt)
        priceNum = findViewById(R.id.priceNumField)

        itemList = mutableListOf()


        findViewById<Button>(R.id.submitBtn).setOnClickListener {
            


        }

    }
}