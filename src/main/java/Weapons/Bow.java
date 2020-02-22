package Weapons;

import specialPowers.IWeaponable;

public class Bow extends Weapon implements IWeaponable {
    public Bow(int strength){
        super(strength);
    }

    public int useWeapons() {
        double dice = Math.random();
        double hitStrength = strength * dice;
        return (int) hitStrength;
    }
}
