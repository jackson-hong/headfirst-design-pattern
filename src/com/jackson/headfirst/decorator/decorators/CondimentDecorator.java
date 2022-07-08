package com.jackson.headfirst.decorator.decorators;

import com.jackson.headfirst.decorator.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;
    public abstract String getDescription();

}
