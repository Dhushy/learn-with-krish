package com.designpatterns.builder;

public abstract class Sandwich implements Bill {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
