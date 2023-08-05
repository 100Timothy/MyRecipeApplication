package com.example.myrecipeapplication.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Recipe_name")
data class Recipe(
    @PrimaryKey(autoGenerate = true)
    val id: String,
    val ingredients: String,
    val Serves: String,
    val Steps: String
)
