package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbility(){
        setDamage(20);
        setHealth(290);
        setSuperAbilityType("heals");
        System.out.println("Medic: "+getHealth()+"  hp:"+getDamage()+" dd    superpower:"+getSuperAbilityType());
    }
}
