package Weapons;

public abstract class Weapon {

    int strength;

    public Weapon(int strength){
        this.strength = strength;
    }

    public int getStrength(){
        return this.strength;
    }

}
