package com.jackson.headfirst.decorator.decorators;

import com.jackson.headfirst.decorator.Beverage;

public class SoyMilk extends CondimentDecorator{

    public SoyMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", SoyMilk";
    }
}
