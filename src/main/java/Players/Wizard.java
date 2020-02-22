package Players;

import Spells.Fireball;
import Spells.Lightening;
import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import specialPowers.ISpellable;

import java.util.ArrayList;

public class Wizard extends Player {

    ArrayList<ISpellable> spells;
    public Wizard(String name, int healingPoints){
        super(name, healingPoints);
        this.spells = new ArrayList<ISpellable>();
    }


    public int spellsCount(){
        return spells.size();
    }

    public void addFireball(Fireball fireball) {
        spells.add(fireball);
    }

    public void addLightening(Lightening lightening){spells.add(lightening);
    }

    public void addSpell(ISpellable spell) {
        spells.add(spell);
    }
}
