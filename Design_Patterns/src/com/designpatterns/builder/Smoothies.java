package com.designpatterns.builder;

public abstract class  Smoothies implements Bill{
    @Override
    public Packing packing() {
        return new Jar();
    }

    @Override
    public abstract float price();
}
