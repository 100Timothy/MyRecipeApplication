package com.example.myrecipeapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailedActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val food = intent.getParcelableExtra<Food>("food")
        if (food !=null){
            val textView : TextView = findViewById(R.id.detailedActivityTV)
            val imageView : ImageView = findViewById(R.id.detailedActivityIV)

            textView.text = food.name
            Glide.with(this).load(food.image).into(imageView);
            //imageView.setImageResource(food.image)
        }
    }
}