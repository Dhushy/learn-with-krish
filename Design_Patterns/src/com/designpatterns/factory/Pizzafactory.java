package com.designpatterns.factory;

public class Pizzafactory {
    public static Pizza createPizza(String type){
        Pizza p = null;

        if(type.equals("CheesePizza")){
            p = new CheesePizza();
        } else if(type.equals("ChickenPizza")){
            p = new ChickenPizza();
        } else if(type.equals("VegPizza")){
            p = new VegPizza();
        }
        return p;
    }
}
