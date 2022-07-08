package com.jackson.headfirst.strategy;


public class Character {

    private WeaponBehavior weaponBehavior;

    protected void fight(){}

    protected void setWeapon(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

}
