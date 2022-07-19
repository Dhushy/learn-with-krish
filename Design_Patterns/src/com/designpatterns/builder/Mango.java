package com.designpatterns.builder;

public class Mango extends Smoothies{
    @Override
    public float price() {
        return 130.0f;
    }

    @Override
    public String name() {
        return "Mango Smoothie";
    }
}
