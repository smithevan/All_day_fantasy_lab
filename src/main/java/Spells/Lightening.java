package Spells;

import specialPowers.ISpellable;

public class Lightening extends Spell implements ISpellable {

    public Lightening(int strength){
        super(strength);
    }

    public int castSpell() {
        double dice = Math.random();
        double hitStrength = strength * dice;
        return (int) hitStrength;
    }

}
