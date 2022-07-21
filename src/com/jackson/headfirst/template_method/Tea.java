package com.jackson.headfirst.template_method;

public class Tea extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("adding lemon");
    }

    @Override
    protected void brew() {
        System.out.println("brewing tea bag");
    }
}
