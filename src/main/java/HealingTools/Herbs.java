package HealingTools;

import specialPowers.IHealable;

public class Herbs extends HealingTool implements IHealable {

    public Herbs(String name, int strength){
        super(name, strength);
    }

}
