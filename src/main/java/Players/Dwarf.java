package Players;

import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import enemies.IEnemy;
import enemies.Orc;
import specialPowers.IWeaponable;

import java.util.ArrayList;

public class Dwarf extends Player implements IPlayable{
    ArrayList<IWeaponable> weapons;
    public Dwarf(String name, int healingPoints) {
        super(name, healingPoints);
        this.weapons = new ArrayList<IWeaponable>();
    }

    public int weaponCount(){
        return weapons.size();
    }

    public void addSword(Sword sword) {
        weapons.add(sword);
    }

    public void addAxe(Axe axe){
        weapons.add(axe);
    }

    public void addBow(Bow bow) {
        weapons.add(bow);
    }

    public void addWeapon(IWeaponable weapon) {
        weapons.add(weapon);
    }

    public void takeDamage(int injury) {
        healingPoints -= injury;
        if (healingPoints <= 0){
            healingPoints = 0;
        }
    }


    public int attack(IEnemy enemy) {
        int hitStrength = 0;
        for (int i = 0; i < weapons.size(); i++){
            hitStrength +=  weapons.get(i).useWeapons();
        }
        enemy.damage(hitStrength);
        System.out.println("The Dwarf Has Attacked with " + hitStrength + ", enemy now at " + enemy.getHealth());
        return hitStrength;
    }
}
