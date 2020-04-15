package com.kovanidis.spring5recipeapp.services;

import com.kovanidis.spring5recipeapp.commands.RecipeCommand;
import com.kovanidis.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);

    void deleteById(Long idToDelete);
}
