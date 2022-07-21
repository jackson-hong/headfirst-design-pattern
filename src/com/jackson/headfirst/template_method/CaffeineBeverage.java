package com.jackson.headfirst.template_method;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void pourInCup() {
        System.out.println("pouring in the cup!");
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void boilWater() {
        System.out.println("boiling water");
    }

}

// 템플릿 메소드는 알고리즘의 각 단계를 정의하며,
// 서브클래스에서 일부 단계를 구현할 수 있도록 유도

// 즉 템플릿 메소드는 알고리즘의 골격(틀 -> template)을 정의한다.
// 텟플릿 메소드를 사용하면 알고리즘의 일부 단계를 서브클래스에서 구현할 수 있다.