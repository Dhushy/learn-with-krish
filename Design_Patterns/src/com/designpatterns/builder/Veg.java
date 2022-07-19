package com.designpatterns.builder;

public class Veg extends Sandwich{
    @Override
    public float price() {
        return 450.0f;
    }

    @Override
    public String name() {
        return "Veg Sandwich ";
    }
}
