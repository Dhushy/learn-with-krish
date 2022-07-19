package com.designpatterns.builder;

public class NonVeg  extends Sandwich{

    @Override
    public float price() {
        return 550.5f;
    }

    @Override
    public String name() {
        return "Chicken Sandwich";
    }
}
