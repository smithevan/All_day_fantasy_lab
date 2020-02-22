package Players;

import specialPowers.ISpellable;
import specialPowers.IWeaponable;

import java.util.ArrayList;

public class Warlock extends Player{

    ArrayList<ISpellable> spells;
    public Warlock(String name, int healingPoints){
        super(name, healingPoints);
        this.spells = new ArrayList<ISpellable>();
    }

}
