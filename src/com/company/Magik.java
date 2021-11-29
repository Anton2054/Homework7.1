package com.company;

public class Magik extends Hero {
    @Override
    public void applySuperAbility() {
        setDamage(100);
        setHealth(310);
        setSuperAbilityType("Absolute Attack");
        System.out.println("Magic:" + getHealth() + "  hp:" + getDamage() + " dd    superpower:" + getSuperAbilityType());
    }
}
