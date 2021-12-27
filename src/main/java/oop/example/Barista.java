package oop.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Barista {
    private Map<String, Recipe> recipeMap;

    public Barista(Map<String, Recipe> recipeMap) {
        this.recipeMap = recipeMap;
    }

    public Optional<Coffee> makeCoffee(MenuItem menuItem){
        if (hasRecipe(menuItem)) {
            return Optional.of(new Coffee(menuItem));
        } else {
            return Optional.empty();
        }
    }

    private boolean hasRecipe(MenuItem menuItem){
        return recipeMap.containsKey(menuItem.getName());
    }
}
