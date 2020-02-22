package Weapons;

import specialPowers.IWeaponable;

public class Axe extends Weapon implements IWeaponable {
    public Axe(int strength){
        super(strength);
    }

    public int useWeapons() {
        double dice = Math.random();
        double hitStrength = strength * dice;
        return (int) hitStrength;
    }


}
