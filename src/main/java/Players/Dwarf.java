package Players;

import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import specialPowers.IWeaponable;

import java.util.ArrayList;

public class Dwarf extends Player{
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

    public void takeDamage(int injury) {
        healingPoints -= injury;
    }


    public int attack() {
        int attackStrength = 0;
        for (int i = 0; i < weapons.size(); i++){
            attackStrength +=  weapons.get(i).useWeapons();
        }
        return attackStrength;


    }
}
