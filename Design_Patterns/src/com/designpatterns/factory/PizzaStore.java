package com.designpatterns.factory;

public class PizzaStore {
    public Pizza orderPizza(String type){
       // Pizza p = null;
        Pizza p = Pizzafactory.createPizza(type);

//        if(type.equals("CheesePizza")){
//            p = new CheesePizza();
//        } else if(type.equals("ChickenPizza")){
//            p = new ChickenPizza();
//        } else if(type.equals("VegPizza")){
//            p = new VegPizza();
//        }

        p.prepare();
        p.bake();
        p.cut();
        return p;
    }
}

