package Players;

import specialPowers.IHealable;
import specialPowers.IWeaponable;

import java.util.ArrayList;

public class Cleric extends Player{

    ArrayList<IHealable> healables;
    public Cleric(String name, int healingPoints) {
        super(name, healingPoints);
        this.healables = new ArrayList<IHealable>();
    }



}
