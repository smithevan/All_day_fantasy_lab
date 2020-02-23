package mythicalcreatures;

import specialPowers.ICreaturable;

public class Ogre extends Creature implements ICreaturable {

    public Ogre(int strength, String name){
        super(strength, name);
    }

    public int attack() {
        double dice = Math.random();
        double hitStrength = strength * dice;
        return (int) hitStrength;
    }

}
