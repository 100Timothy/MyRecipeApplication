package com.example.myrecipeapplication.entities

import androidx.lifecycle.LiveData

class RecipeRepository(private val RecipeDao: RecipeDao) {

    val readAllData: LiveData<List<Recipe>> = RecipeDao.readAllData()

    suspend fun addRecipe( recipe: Recipe){
        RecipeDao.addRecipe(recipe)
    }
}