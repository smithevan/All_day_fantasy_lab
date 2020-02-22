package enemies;

import Players.Dwarf;
import Players.IPlayable;
import specialPowers.IWeaponable;

import java.util.ArrayList;

public class Orc extends Enemy{

    public Orc(String name, int strength, int health) {
        super(name, strength, health);
    }


    public String damage(int injury) {
        health -= injury;
        if (health <= 0){
            health = 0;
            return "The Orc Has Been Defeated";
        } else {
            return "";
        }
    }


    public String attack(IPlayable iPlayable) {
        double dice = Math.random();
        int hitStrength = (int) (strength * dice);

        iPlayable.takeDamage(hitStrength);
        return "The Orc has Attacked";

    }
}
