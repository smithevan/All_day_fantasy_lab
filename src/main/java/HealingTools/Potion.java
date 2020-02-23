package HealingTools;

import specialPowers.IHealable;

public class Potion extends HealingTool implements IHealable {

    public Potion(String name, int strength){
        super(name, strength);
    }
}
