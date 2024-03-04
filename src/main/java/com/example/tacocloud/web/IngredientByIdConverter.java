package com.example.tacocloud.web;

import com.example.tacocloud.Ingredients;
import com.example.tacocloud.Ingredients.Type;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredients> {
    private Map<String, Ingredients> ingredientMap = new HashMap<>();
    public IngredientByIdConverter() {
        ingredientMap.put("FLTO",
                new Ingredients("FLTO", "Flour Tortilla", Type.WRAP));
        ingredientMap.put("COTO",
                new Ingredients("COTO", "Corn Tortilla", Type.WRAP));
        ingredientMap.put("GRBF",
                new Ingredients("GRBF", "Ground Beef", Type.PROTEIN));
        ingredientMap.put("CARN",
                new Ingredients("CARN", "Carnitas", Type.PROTEIN));
        ingredientMap.put("TMTO",
                new Ingredients("TMTO", "Diced Tomatoes", Type.VEGGIES));
        ingredientMap.put("LETC",
                new Ingredients("LETC", "Lettuce", Type.VEGGIES));
        ingredientMap.put("CHED",
                new Ingredients("CHED", "Cheddar", Type.CHEESE));
        ingredientMap.put("JACK",
                new Ingredients("JACK", "Monterrey Jack", Type.CHEESE));
        ingredientMap.put("SLSA",
                new Ingredients("SLSA", "Salsa", Type.SAUCE));
        ingredientMap.put("SRCR",
                new Ingredients("SRCR", "Sour Cream", Type.SAUCE));
    }
    @Override
    public Ingredients convert(String id) {
        return ingredientMap.get(id);
    }
}