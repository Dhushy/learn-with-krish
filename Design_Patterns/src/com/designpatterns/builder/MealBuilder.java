package com.designpatterns.builder;

public class MealBuilder {
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem((Bill) new NonVeg());
        meal.addItem(new Stawberry());
        return meal;
    }

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new Veg());
        meal.addItem(new Banana());
        return meal;
    }
}
