package enemies;

import specialPowers.IWeaponable;

import java.util.ArrayList;

public class Orc extends Enemy{

    public Orc(String name, int strength, int health) {
        super(name, strength, health);
    }


    public void damage(int injury) {
        health -= injury;
    }


    public int attack() {
        double dice = Math.random();
        double hitStrength = strength * dice;
        return (int) hitStrength;

    }
}
