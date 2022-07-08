package com.jackson.headfirst.strategy;

public class BowAndArrowBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("BowAndArrow");
    }
}
