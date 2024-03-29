package com.example.myrecipeapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList : ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(Food(R.drawable.beefrice, "Rice and Beef"))
        foodList.add(Food(R.drawable.burgerfries, "Burger and Fries"))
        foodList.add(Food(R.drawable.chickenbiryani, "Chicken Biryani"))
        foodList.add(Food(R.drawable.friedrice, "Japanese Fried Rice"))
        foodList.add(Food(R.drawable.pasta, "Pasta"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.porkribs,"Pork Ribs"))


        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter

        foodAdapter.onItemClick = {
            val intent = Intent(this ,DetailedActivity::class.java)
            intent.putExtra("food" , it)
            startActivity(intent)
        }
    }
}