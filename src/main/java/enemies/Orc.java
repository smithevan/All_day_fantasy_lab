package enemies;

import Players.Dwarf;
import Players.IPlayable;
import specialPowers.IWeaponable;

import java.util.ArrayList;

public class Orc extends Enemy{

    public Orc(String name, int strength, int health) {
        super(name, strength, health);
    }

    public String getName(){
        return name;
    }


    public int damage(int injury) {
        health -= injury;
        if (health <= 0){
            health = 0;
            return health;
        } else {
            return health;
        }
    }


    public int attack(IPlayable iPlayable) {
        double dice = Math.random();
        int hitStrength = (int) (strength * dice);

        iPlayable.takeDamage(hitStrength);
        System.out.println("The Orc Has Attacked with " + hitStrength + ", player now at " + iPlayable.getHealingPoints());
        return hitStrength;
    }
}
