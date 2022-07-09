package com.jackson.headfirst.factory.NYStyle;

import com.jackson.headfirst.factory.Pizza;
import com.jackson.headfirst.factory.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
        }

        return null;
    }
}
