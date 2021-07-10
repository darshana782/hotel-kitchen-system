//package com.hotelsystem.hotelkitchensystem.example.controller;
//
//import com.hotelsystem.hotelkitchensystem.example.model.Ingredient;
//import com.hotelsystem.hotelkitchensystem.example.service.IngredientService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class IngredientsController {
//
//    @Autowired
//    private IngredientService ingredientService;
//
//    @PostMapping("/addIngredient")
//    public Ingredient addIngredient(@RequestBody Ingredient ingredient){
//        return ingredientService.saveIngredient(ingredient);
//    }
//
//    @PostMapping("/addIngredients")
//    public List<Ingredient> addIngredients(@RequestBody List<Ingredient> ingredients){
//        return ingredientService.saveIngredients(ingredients);
//    }
//
//    @GetMapping("/ingredients")
//    public List<Ingredient> findAllIngredients(){
//        return ingredientService.getIngredients();
//    }
//
//    @GetMapping("/ingredientById/{ingredientId}")
//    public Ingredient findIngredientById(@PathVariable int ingredientId){
//        return ingredientService.getIngredientById(ingredientId);
//    }
//
////    @GetMapping("/ingredientByName/{ingredientName")
////    public Ingredient findIngredientByName(@PathVariable String ingredientName){
////        return ingredientService.getIngredientByName(ingredientName);
////    }
//
//    @PutMapping("/updateIngredient")
//    public Ingredient updateIngredient(@RequestBody Ingredient ingredient){
//        return ingredientService.updateIngredient(ingredient);
//    }
//
//    @DeleteMapping("/deleteIngredient/{ingredientId}")
//    public String deleteIngredient(@PathVariable int ingredientId){
//        return ingredientService.deleteIngredient(ingredientId);
//    }
//
//
//}
