package Players;

import Spells.Fireball;
import Spells.Lightening;
import enemies.IEnemy;
import specialPowers.ICreaturable;
import specialPowers.ISpellable;
import specialPowers.IWeaponable;
import treasure.ITreasurable;

import java.util.ArrayList;

public class Warlock extends Player implements IPlayable{

    ArrayList<ISpellable> spells;
    ArrayList<ICreaturable> creatures;
    public Warlock(String name, int healingPoints){
        super(name, healingPoints);
        this.spells = new ArrayList<ISpellable>();
        this.creatures = new ArrayList<ICreaturable>();
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

    public int countCreatures(){
        return creatures.size();
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
            if (countCreatures() > 0 ){
                for (int j = 0; j < countCreatures(); j++){
                    hitStrength += creatures.get(j).attack();
                    System.out.println("The " + creatures.get(j).getName() + " has attacked.");
                }
            }

            spellIndex = i;
            nextSpellIndex += i; // for logging second spell if there is one, not used yet
        }
        enemy.damage(hitStrength);
        System.out.println("The Warlock Has Attacked with " + spells.get(spellIndex).getName() +
                "(" + hitStrength + ")" + ", enemy now at " + enemy.getHealth());
        return hitStrength;
    }


    public void addICreaturable(ICreaturable creature) {
        creatures.add(creature);
    }

    public void removeIcreature(ICreaturable creature) {
        creatures.remove(creature);

    }

}
