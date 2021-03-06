package com.designpatterns.builder;

public class App {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total  " + nonVegMeal.getCost());

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total: " + vegMeal.getCost());
    }
}
