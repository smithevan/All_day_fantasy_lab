package Players;

import Spells.Fireball;
import Spells.Lightening;
import enemies.IEnemy;
import specialPowers.IHealable;
import specialPowers.ISpellable;
import specialPowers.IWeaponable;

import java.util.ArrayList;

public class Cleric extends Player{

    ArrayList<IHealable> healables;
    public Cleric(String name, int healingPoints) {
        super(name, healingPoints);
        this.healables = new ArrayList<IHealable>();
    }

    public int healableCount(){
        return healables.size();
    }

    public void addHealable(IHealable healable) {
        healables.add(healable);
    }

    public void removeHealable(IHealable healable) {
        healables.remove(healable);
    }

    public void takeDamage(int injury) {
        healingPoints -= injury;
        if (healingPoints <= 0){
            healingPoints = 0;
        }
    }


    public int heal(IPlayable player) {
        int healingStrength = 0;
        int healableIndex = 0;
        for (int i = 0; i < healableCount(); i++){
            healingStrength +=  healables.get(i).useHealable();
            healableIndex = i;

        }
        player.addHealth(healingStrength);
        System.out.println("The Cleric Has Healed with " + healables.get(healableIndex).getName() +
                "(+" + healingStrength + "HP) " + player.getName()+" now at " + player.getHealingPoints() + "HP");
        return healingStrength;
    }



}
