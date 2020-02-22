package HealingTools;

import specialPowers.IHealable;

public class Potion extends HealingTool implements IHealable {

    public Potion(int strength){
        super(strength);
    }
}
