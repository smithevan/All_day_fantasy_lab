package Weapons;

import specialPowers.IWeaponable;

public class Sword extends Weapon implements IWeaponable {
    public Sword(int strength){
        super(strength);
    }

    public int useWeapons() {
        double dice = Math.random();
        double hitStrength = strength * dice;
        return (int) hitStrength;
    }

}
