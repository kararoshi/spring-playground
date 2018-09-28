package ga.mizgua.recipeapp.services;

import ga.mizgua.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);
}
