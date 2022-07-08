package com.jackson.headfirst.strategy;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Knife");
    }
}
