package Spells;

import specialPowers.ISpellable;

public class Fireball extends Spell implements ISpellable {

    public Fireball(int strength){
        super(strength);
    }

    public int castSpell() {
        double dice = Math.random();
        double hitStrength = strength * dice;
        return (int) hitStrength;
    }

}
