package com.designpatterns.builder;

public class Banana  extends Smoothies {
    @Override
    public float price() {
        return 140.0f;
    }

    @Override
    public String name() {
        return "Banana Smoothie";
    }
}
