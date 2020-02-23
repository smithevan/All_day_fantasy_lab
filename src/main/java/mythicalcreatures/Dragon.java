package mythicalcreatures;

import specialPowers.ICreaturable;

public class Dragon extends Creature implements ICreaturable {

    public Dragon(int strength, String name, int health){
        super(strength, name, health);
    }

    public int attack() {
        double dice = Math.random();
        double hitStrength = strength * dice;
        return (int) hitStrength;
    }

}
