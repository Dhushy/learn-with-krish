package com.designpatterns.builder;

public interface Bill {
    public String name();
    public Packing packing();
    public float price();
}
