package com.hotelsystem.hotelkitchensystem.example.service;

import com.hotelsystem.hotelkitchensystem.example.model.Ingredient;
import com.hotelsystem.hotelkitchensystem.example.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    //post method
    public Ingredient saveIngredient(Ingredient ingredient){
        return ingredientRepository.save(ingredient);
    }

    public List<Ingredient> saveIngredients(List<Ingredient> ingredients){
        return (List<Ingredient>) ingredientRepository.saveAll(ingredients);
    }

    //get
    public List<Ingredient> getIngredients(){
        return ingredientRepository.findAll();
    }

    public Ingredient getIngredientById(int ingerdientId){
        return ingredientRepository.findById(ingerdientId).orElse(null);
    }

    //get ny name
//    public Ingredient getIngredientByName(String ingredientName){
//        return ingredientRepository.findByName(ingredientName);
//    }

    //delete ingredient
    public String deleteIngredient(int ingerdientId){
        ingredientRepository.deleteById(ingerdientId);
        return "Ingredient Removed.. "+ingerdientId;
    }


    //update ingredient
    public Ingredient updateIngredient(Ingredient ingredient){
        Ingredient existingIngredient=ingredientRepository.findById(ingredient.getIngredientId()).orElse(null);
        existingIngredient.setIngredientName(ingredient.getIngredientName());
        existingIngredient.setQty(ingredient.getQty());
        existingIngredient.setReorderLevel(ingredient.getReorderLevel());
        return ingredientRepository.save(existingIngredient);
    }
}
