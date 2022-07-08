package com.jackson.headfirst.strategy;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Axe");
    }
}
