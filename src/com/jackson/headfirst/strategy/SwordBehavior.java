package com.jackson.headfirst.strategy;

public class SwordBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Sword");
    }
}
