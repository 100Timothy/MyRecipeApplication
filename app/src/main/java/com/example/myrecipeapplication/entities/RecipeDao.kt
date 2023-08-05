package com.example.myrecipeapplication.entities

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RecipeDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addRecipe(user: Recipe)

    @Query(value = "SELECT * FROM Recipe_name ORDER BY id ASC")
    fun readAllData(): LiveData<List<Recipe>>
}