package com.company;

public class Warrior extends Hero{

    @Override
    public void applySuperAbility(){
        setDamage(90);
        setHealth(320);
        setSuperAbilityType("CRITICAL DAMAGE ");
        System.out.println("Warrior:"+getHealth()+"  hp:"+getDamage()+" dd   superpower:"+getSuperAbilityType());
    }
}
