package com.jackson.headfirst.template_method;

public class Coffee extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("adding cream");
    }

    @Override
    protected void brew() {
        System.out.println("brewing coffee");
    }
}
