package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var items: MutableList<Item>
    lateinit var wishlistRv: RecyclerView

    lateinit var itemET: EditText
    lateinit var urlET: EditText
    lateinit var priceNum: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wishlistRv = findViewById(R.id.wishlistView)

        itemET = findViewById(R.id.itemEt)
        urlET = findViewById(R.id.urlEt)
        priceNum = findViewById(R.id.priceNumField)

        items = mutableListOf()
        val iAdapter = ItemAdapter(items)

        wishlistRv.adapter = iAdapter
        wishlistRv.layoutManager = LinearLayoutManager(this)


        findViewById<Button>(R.id.submitBtn).setOnClickListener {
            val newItem =  Item(itemET.text.toString(), priceNum.text.toString(), urlET.text.toString() )

            items.add(newItem)
            iAdapter.notifyDataSetChanged()

            itemET.text.clear()
            priceNum.text.clear()
            urlET.text.clear()
            /// When the button is clicked it will scroll to the new item
            wishlistRv.smoothScrollToPosition(items.lastIndex)
        }

    }
}