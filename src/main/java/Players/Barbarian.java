package Players;

import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import enemies.IEnemy;
import specialPowers.IWeaponable;

import java.util.ArrayList;

public class Barbarian extends Player implements IPlayable{
    ArrayList<IWeaponable> weapons;
    public Barbarian(String name, int healingPoints){
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

    public void removeWeapon(IWeaponable weapon) {
        weapons.remove(weapon);
    }

    public void takeDamage(int injury) {
        healingPoints -= injury;
    }

    public int attack(IEnemy enemy) {
        int hitStrength = 0;
        for (int i = 0; i < weapons.size(); i++){
            hitStrength +=  weapons.get(i).useWeapons();
        }
        enemy.damage(hitStrength);
        System.out.print("The Dwarf Has Attacked");
        return hitStrength;
    }
}
