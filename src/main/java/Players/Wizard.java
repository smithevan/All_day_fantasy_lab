package Players;

import Spells.Fireball;
import Spells.Lightening;
import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import enemies.IEnemy;
import specialPowers.ISpellable;

import java.util.ArrayList;

public class Wizard extends Player implements IPlayable{

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

    public void removeSpell(ISpellable spell) {
        spells.remove(spell);
    }

    public void takeDamage(int injury) {
        healingPoints -= injury;
        if (healingPoints <= 0){
            healingPoints = 0;
        }
    }

    public int attack(IEnemy enemy) {
        int hitStrength = 0;
        int spellIndex = 0;
        int nextSpellIndex = 0;
        for (int i = 0; i < spells.size(); i++){
            hitStrength +=  spells.get(i).castSpell();
            spellIndex = i;
            nextSpellIndex += i; // for logging second spell if there is one
        }
        enemy.damage(hitStrength);
        System.out.println("The Wizard Has Attacked with " + spells.get(spellIndex).getName() +
                "(" + hitStrength + ")" + ", enemy now at " + enemy.getHealth());
        return hitStrength;
    }

}
