package com.designpatterns.builder;

public class Telescoping {
    private String name;
    private Bill Bill;
    private float price;

    public Telescoping(String name, Bill Bill, float price){
        this.name = name;
        this.Bill = Bill;
        this.price = price;
    }
    public Telescoping(String name,Bill Bill){
        this.name = name;
        this.Bill = Bill;
    }
    public Telescoping(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Telescoping [" + "name" + name + ", Bill=" + Bill + ", price=" + price + '}';
    }
}
